package `lecture9-desktop`

// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mongodb.client.FindIterable
import com.mongodb.client.MongoCollection
import org.litote.kmongo.*


@Composable
fun RowScope.tableCell(
    text: String,
    color: Color,
    weight: Float
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, Color.Black)
            .weight(weight)
            .padding(8.dp),
        color = color
    )
}

@Composable
fun tableScreen(items: FindIterable<Item>) {
    val tableData = (items).mapIndexed { index, item ->
        index to item
    }

    val column1Weight = .1f
    val column2Weight = .65f
    val column3Weight = .15f
    val column4Weight = .1f

    LazyColumn(Modifier.fillMaxSize().padding(50.dp)) {

        item {
            Row(Modifier.background(MaterialTheme.colors.primary)) {
                tableCell(text = "#", weight = column1Weight, color = MaterialTheme.colors.onPrimary)
                tableCell(text = "Task title", weight = column2Weight, color = MaterialTheme.colors.onPrimary)
                tableCell(text = "Category", weight = column3Weight, color = MaterialTheme.colors.onPrimary)
                tableCell(text = "Done", weight = column4Weight, color = MaterialTheme.colors.onPrimary)
            }
        }

        items(tableData) {
            val (id, item) = it
            Row(Modifier.fillMaxWidth()) {
                tableCell(text = id.toString(), weight = column1Weight, color = Color.Black)
                tableCell(text = item.name, weight = column2Weight, color = Color.Black)
                tableCell(text = item.category, weight = column3Weight, color = Color.Black)
                tableCell(text = if (item.done) "Yes" else "No", weight = column4Weight, color = Color.Black)
            }
        }
    }
}

@Composable
@Preview
fun app(items: MongoCollection<Item>) {
    val text1 by remember { mutableStateOf("All notes") }
    val text2 by remember { mutableStateOf("Shopping notes") }
    val text3 by remember { mutableStateOf("Work notes") }
    val text4 by remember { mutableStateOf("Update first shopping notes") }

    val itemList = mutableStateOf(items.find())

    MaterialTheme {
        Row(modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button( modifier = Modifier.padding(horizontal = 12.dp), onClick = {
                itemList.value = items.find()
            }) {
                Text(text1)
            }
            Button( modifier = Modifier.padding(horizontal = 12.dp), onClick = {
                itemList.value = items.find(Item::category eq "Shopping")
            }) {
                Text(text2)
            }
            Button( modifier = Modifier.padding(horizontal = 12.dp), onClick = {
                itemList.value = items.find(Item::category eq "Work")
            }) {
                Text(text3)

            }
            Button( modifier = Modifier.padding(horizontal = 12.dp), onClick = {
                val item: Item? = items.findOne(Item::category eq "Shopping")
                items.updateOne(Item::category eq "Shopping", setValue(Item::done, !(item!!.done)))
                itemList.value = items.find(Item::category eq "Shopping")
            }) {
                Text(text4)

            }
        }
        tableScreen(itemList.value)
    }

}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "My Compose Desktop App") {
        //connect
        val db = DbConnection(
            "mongodb+srv://$dbAuth@cluster0.q3d7o.gcp.mongodb.net/myFirstDatabase?retryWrites=true\n",
            "NotesDB"
        )

        //items
        val items = db.getItems()

        //composing app
        app(items)
    }
}
