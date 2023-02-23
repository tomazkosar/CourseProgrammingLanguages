package main.kotlin.lecture2

import java.time.LocalDate

open class Persona(var name: String, val birthdate: LocalDate = LocalDate.now())

class Student(name: String, birthdate: LocalDate, var studentID: Long): Persona(name, birthdate)

fun main(args: Array<String>) {
    val p1 = Persona("Tomaz", LocalDate.of(1978, 10, 12))

    val s1 = Student("Lovro", LocalDate.of(2002, 6, 27), 12345566778)

    println ("${s1.name} ${s1.birthdate} ${s1.studentID}")
}

