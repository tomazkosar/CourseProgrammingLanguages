package lecture3

abstract class AbstractMammal(val name: String){
    abstract fun greetMammal(): String
}

class Dog(_name: String) : AbstractMammal(_name){
    override fun greetMammal(): String {
        return "Hello $name!"
    }
}

fun main() {
    var dog = Dog("Ben")
    println(dog.greetMammal())
}


