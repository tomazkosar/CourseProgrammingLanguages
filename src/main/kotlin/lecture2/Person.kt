package lecture2

import java.time.LocalDate

/*class Person(var name: String, val birthdate: LocalDate = LocalDate.now()) {
    // initializer block
    init {
        name = name.uppercase()
    }
}

fun lecture1.main(args: Array<String>) {
    val person1 = Person("tomaz")
    println(person1.name)
}*/

//avoid using block init
/*class Person(name: String, val birthdate: LocalDate = LocalDate.now()) {
    var name = name.uppercase()
}

fun lecture1.main(args: Array<String>) {
    val person1 = Person("tomaz")
    println(person1.name + " " + person1.age)
}*/

/*
class Person(var name: String = "/", val birthdate: LocalDate = LocalDate.now())
*/

//set method
class Person(name: String = "/", val birthdate: LocalDate = LocalDate.now()) {
    var name: String = name.uppercase()
        set(value) { field = value.uppercase() }
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz")
    println(person1.name)

    val person2 = Person()
    person2.name = "matej"
    println(person2.name)
}

