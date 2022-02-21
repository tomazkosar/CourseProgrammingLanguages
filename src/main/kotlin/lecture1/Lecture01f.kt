fun main() {
    val random: Int = (1..10).random()
    var input: String
    var number: Int
    var counter = 0
    val tries = ArrayList<Int?>()

    do {
        counter++
        print("Enter an integer: ")
        input = readLine()!!
        val number = input.toIntOrNull()

        when {
            number == null -> println ("wrong number")
            random < number -> println ("less")
            random > number -> println ("higher")
            else ->  println ("Bravo!")
        }
        tries.add(number)

    } while (random != number)

    println ("Tries:")
    for (i in 0 until counter) println(" ${i+1} -> ${tries[i]}")
}

