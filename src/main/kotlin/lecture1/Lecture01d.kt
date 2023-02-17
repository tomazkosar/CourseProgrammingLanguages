package lecture1

data class Person(var name: String, var age: Int, var gender: Char)

fun main() {
    val tom = Person ("Tomaz", 44, 'M')

    println("${tom.name}, ${tom.age}, ${tom.gender}")
}

