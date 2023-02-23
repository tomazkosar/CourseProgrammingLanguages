package main.kotlin.lecture1

class Lecture01a (var initialized: Int = 0)

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        val example = Lecture01a()
        println(message = "Initialized local variable: ${example.initialized}")
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        for (item in numbers) {
            println("Number: $item")
        }
    }
}

