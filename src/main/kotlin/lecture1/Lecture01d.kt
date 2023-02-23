package main.kotlin.lecture1

import java.time.LocalDate

data class Person(var name: String, val birthdate: LocalDate = LocalDate.now(), var gender: Char)

fun main() {
    val tom = Person ("Tomaz", LocalDate.of(1978, 10, 12), 'M')

    println("${tom.name}, ${tom.birthdate}, ${tom.gender}")
}

