package lecture2

open class Persona(var name: String, var age: Int)

class Student(name: String, age: Int, var studentID: Long): Persona(name, age)

fun main(args: Array<String>) {
    val p1 = Persona("Tomaz", 43)

    val s1 = Student("Lovro", 20, 12345566778)
}

