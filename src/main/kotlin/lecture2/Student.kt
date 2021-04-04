package lecture2

open class Persona(_name: String, _age: Int) {
    var name: String = _name.capitalize()
    var age: Int = _age
}

class Student(_name: String, _age: Int, _studentID: Long): Persona(_name, _age) {
    var studentID: Long = _studentID
}

fun main(args: Array<String>) {
    val name: String
    val index:Int

    val p1 = Persona("Tomaz", 42)

    val s1 = Student("Lovro", 20, 12345566778)
}

