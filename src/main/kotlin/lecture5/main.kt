package lecture5

import kotlin.Array as Array



fun main() {
    val noteItemDao = ExamDaoImpl()
    val examList: List<Exam>

    println("All exams")
    println("------")
    examList = noteItemDao.getAllExams()
    examList.forEach { println(it) }

    println("First exam")
    println("------")
    println(noteItemDao.getExam(1))

    println("Update first exam")
    println("------")
    examList[0].done = true
    noteItemDao.updateExam(examList[0])

    println("Delete third exam")
    println("------")
    noteItemDao.deleteExam(examList[2])




}

