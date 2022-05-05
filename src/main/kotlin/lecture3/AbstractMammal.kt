package lecture3

abstract class AbstractMammal(val name: String){
    abstract fun greetMammal(): String
}

class Dog(name: String) : AbstractMammal(name){
    override fun greetMammal(): String {
        return "Hello $name!"
    }
}

fun main() {
    var dog = Dog("Ben")
    println(dog.greetMammal())
}


