package lecture2

import java.time.LocalDate
import java.time.Period

/*class Person(var name: String, val birthdate: LocalDate = LocalDate.now()) {
    // initializer block
    init {
        name = name.uppercase()
    }
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz")
    println(person1.name)
}*/

//avoid using block init
/*class Person(name: String, val birthdate: LocalDate = LocalDate.now()) {
    var name = name.uppercase()
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz")
    println(person1.name + " " + person1.birthdate)
}*/

/*
class Person(var name: String = "/", val birthdate: LocalDate = LocalDate.now())

fun main(args: Array<String>) {
    val person1 = Person("tomaz", LocalDate.of(1978, 10, 12))
    println("name: ${person1.name}  birthdate: ${person1.birthdate} ")

    val person2 = Person()
    person2.name = "matej"
    println("name: ${person2.name}  birthdate: ${person2.birthdate} ")
}
*/

//set method
class Person(name: String = "/", val birthdate: LocalDate = LocalDate.now()) {
    var name: String = name.uppercase()
        set(value) {
            field = value.uppercase()
        }
    fun age(): Int = Period.between(birthdate, LocalDate.now()).years
}

fun main() {
    val person1 = Person("tomaz", LocalDate.of(1978, 10, 12))
    println("name: ${person1.name}  birthdate: ${person1.birthdate} age: ${person1.age()}")

    val person2 = Person()
    person2.name = "matej"
    println("name: ${person2.name}  birthdate: ${person2.birthdate} age: ${person2.age()}")
}


