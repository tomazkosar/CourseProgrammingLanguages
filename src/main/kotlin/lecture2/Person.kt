package lecture2

/*class Person(var name: String, var age: Int) {
    // initializer block
    init {
        name = name.uppercase()
    }
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz", 43)
    println(person1.name)
}*/

//avoid using block init
/*class Person(name: String, var age: Int) {
    var name = name.uppercase()
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz", 43)
    println(person1.name + " " + person1.age)
}*/

/*
class Person(var name: String = "/", var age: Int = 0)
*/

//set method
class Person(name: String = "/", age: Int = 0) {
    var name: String = name.uppercase()
        set(value) { field = value.uppercase() }
    var age: Int = age
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz", 43)
    println(person1.name)

    val person2 = Person()
    person2.name = "matej"
    println(person2.name)
}

