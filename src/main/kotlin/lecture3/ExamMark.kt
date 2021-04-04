package lecture3

class ExamMark (var markInPercentage:Int){
    fun isPassed(): Boolean{
        return markInPercentage > 50
    }
    companion object { //name of object can be avoided
        var examTitle:String = "Programming languages"
        fun printTitle() = println("Result at exam $examTitle is ->")
    }
}

fun ExamMark.isExcellent(): Boolean{
    return markInPercentage >= 90
}

fun main(){
    val studentMark = ExamMark(90)
    ExamMark.printTitle()

    val passingStatus = studentMark.isPassed()
    println("Student passing: $passingStatus")

    val excellentStatus = studentMark.isExcellent()
    println("Student excellent: $excellentStatus")
}

