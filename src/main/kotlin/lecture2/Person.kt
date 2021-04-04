package lecture2

/*
class Person(_name: String, _age: Int) {
    val name: String
    var age: Int
    // initializer block
    init {
        name = _name.capitalize()
        age = _age
    }
}
*/

/*

//avoid using block init
class Person(_name: String, _age: Int) {
    val name: String = _name.capitalize()
    var age: Int = _age
}


fun main(args: Array<String>) {
    val person1 = Person("tomaz", 42)
    println(person1.name)
}
*/


//default value
class Person(_name: String = "/", _age: Int = 0) {
    var name: String = _name.capitalize()
        set(value) { field = value.capitalize() }
    var age: Int = _age
}

fun main(args: Array<String>) {
    val person1 = Person("tomaz", 42)
    println(person1.name)

    val person2 = Person()
    person2.name = "matej"
    println(person2.name)
}


