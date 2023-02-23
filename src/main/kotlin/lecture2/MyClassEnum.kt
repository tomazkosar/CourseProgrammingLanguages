package main.kotlin.lecture2

enum class Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

fun main() {
    val friday = Day.FRIDAY
    println("Friday: " + friday)
    println("Friday: " + friday.ordinal)
}


