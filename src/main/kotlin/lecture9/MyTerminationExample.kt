package lecture9

fun main() {
    val myNumbers = intArrayOf(1, 2, 3)
    for (i in 0..myNumbers.size)
    {
        println(myNumbers[i])
    }
    println("This will not be printed")
}

