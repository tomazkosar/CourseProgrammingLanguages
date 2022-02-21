package lecture2

open class Persona(var name: String, var age: Int)

class Student(_name: String, _age: Int, var studentID: Long): Persona(_name, _age)

fun main(args: Array<String>) {
    val p1 = Persona("Tomaz", 42)

    val s1 = Student("Lovro", 20, 12345566778)
}

