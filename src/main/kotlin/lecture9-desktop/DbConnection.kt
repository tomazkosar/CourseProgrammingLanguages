package `lecture9-desktop`

import com.mongodb.client.*
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection

data class Item(val _id: String, val name: String, var done: Boolean, val category: String, val username: String)

data class User(val _id: String, val name: String, val password: String, val username: String)

data class Category(val _id: String, val name: String)

class DbConnection(url: String, dbName: String) {
    private val client: MongoClient
    private val database: MongoDatabase

    init {
        client = KMongo.createClient(url)
        database = client.getDatabase(dbName)
    }

    fun getUsers(): MongoCollection<User> = database.getCollection<User>("users")

    fun getCategories(): MongoCollection<Category> = database.getCollection<Category>("categories")

    fun getItems(): MongoCollection<Item> = database.getCollection<Item>("items")

    fun <T> printCollection(mc: MongoCollection<T>) {
        for (doc in mc.find())
            println(doc.toString())
        println()
    }
}

