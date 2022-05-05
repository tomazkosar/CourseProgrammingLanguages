package lecture12

data class Student(val name: String, val age: Int)

fun main(args: Array<String>) {

    val students = listOf(
        Student("Tom", 24),
        Student("Luka", 20),
        Student("Matej", 28),
        Student("Miha", 22),
    )

    val firstStudentByAge = students.maxByOrNull({ student -> student.age })

    println(firstStudentByAge)
    println("name: ${firstStudentByAge?.name}")
    println("age: ${firstStudentByAge?.age}")
}

