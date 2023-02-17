package lecture5

interface ExamDao {
    fun getAllExams(): List<Exam>
    fun getExam(id: Int): Exam?
    fun updateExam(exam: Exam)
    fun deleteExam(exam: Exam)
}

