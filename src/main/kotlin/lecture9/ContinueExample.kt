package lecture9

fun main() {
    val numbers = intArrayOf(12, 3, 0, 5, 16, 1)
    for (i in numbers.indices) {
        if (numbers[i] == 0) {
            println("Error, div/0!")
            continue
        }
        println(100 / numbers[i])
    }
}
