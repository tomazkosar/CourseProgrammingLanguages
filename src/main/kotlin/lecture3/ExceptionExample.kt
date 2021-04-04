package lecture3

@Throws(IllegalArgumentException::class)
fun squareArea(num:Int):Int {
    if (num < 0) throw IllegalArgumentException("Square side must be positive! $num")
    return num * num
}

fun main() {
    print("Enter an integer: ")
    val input: String = readLine()!!
    val area: Int = try {
        val number: Int = input.toInt()
        squareArea(number)
    } catch (exception: NumberFormatException) {
        println("Exception: $exception")
        0
    } catch (exception: IllegalArgumentException) {
        println("Exception: $exception")
        0
    } finally {
        println("Done!")
    }
    println("Square: $area")
}

