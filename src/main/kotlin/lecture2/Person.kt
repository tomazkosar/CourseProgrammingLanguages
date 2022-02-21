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
/*class Person(_name: String, _age: Int) {
    val name: String = _name.uppercase()
    var age: Int = _age
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz", 43)
    println(person1.name)
}*/

/*
class Person(var name: String = "/", var age: Int = 0)
*/

//set method
class Person(var _name: String = "/", var _age: Int = 0) {
    var name: String = _name.uppercase()
        set(value) { field = value.uppercase() }
    var age: Int = _age
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz", 42)
    println(person1.name)

    val person2 = Person()
    person2.name = "matej"
    println(person2.name)
}


