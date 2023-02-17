package lecture5

class ExamDaoImpl : ExamDao {

   private val examsList = mutableListOf<Exam>()

    init {
        examsList.add(Exam(1, "Programming language", false))
        examsList.add(Exam(2, "Web programming", false))
        examsList.add(Exam(3, "Compiling programming languages", false))
    }

    override fun getAllExams(): List<Exam> {
        return examsList
    }

    override fun getExam(id: Int): Exam? {
        for (noteItem in examsList) {
            if (noteItem.id == id) {
                return noteItem
            }
        }
        return null
    }

    override fun updateExam(exam: Exam) {
        for (i in examsList.indices) {
            if (examsList[i].id == exam.id) {
                examsList[i] = exam
                return
            }
        }
    }

    override fun deleteExam(exam: Exam) {
        for (i in examsList.indices) {
            if (examsList[i].id == exam.id) {
                examsList.removeAt(i)
                return
            }
        }
    }
}


