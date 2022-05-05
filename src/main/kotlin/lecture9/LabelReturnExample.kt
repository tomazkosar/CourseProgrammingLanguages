package lecture9

fun main() {
    val numbers = intArrayOf(12, 3, 0, 5, 16, 1)
    numbers.forEach {
        if (it == 0) {
            println("Error, div/0!")
            return    //return from nearest function
        }
        println(100 / it)
    }
    println("Out of foreach")
}

/*fun main() {
    val numbers = intArrayOf(12, 3, 0, 5, 16, 1)
    numbers.forEach(fun (value:Int) {
        if (value == 0) {
            println("Error, div/0!")
            return    //return from anonymous function
        }
        println(100 / value)
    }
    )
}*/

/*fun main() {
    val numbers = intArrayOf(12, 3, 0, 5, 16, 1)
    numbers.forEach div@ {
        if (it == 0) {
            println("Error, div/0!")
            return@div    //local return to the caller of the lambda
        }
        println(100 / it)

    }
}*/

/*
fun main() {
    val numbers = intArrayOf(12, 3, 0, 5, 16, 1)
    numbers.forEach {
        if (it == 0) {
            println("Error, div/0!")
            return@forEach    //local return to the caller of the lambda
        }
        println(100 / it)

    }
}*/

/*
fun main() {
    val numbers = intArrayOf(12, 3, 0, 5, 16, 1)
    run loop@{
        numbers.forEach {
            if (it == 0) {
                println("Error, div/0!")
                return@loop    //non-local return
            }
            println(100 / it)

        }
    }
}
*/
