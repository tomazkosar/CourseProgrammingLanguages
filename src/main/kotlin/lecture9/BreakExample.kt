package lecture9

fun main() {
    val matrix = arrayOf<IntArray>(intArrayOf(1, 0, 2), intArrayOf(4, 5, 2))
    outer@ for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] == 0){
                println("Error, div/0!")
                break@outer
            } else
                println(100 / matrix[i][j])
        }
    }
}


