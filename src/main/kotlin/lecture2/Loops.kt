package lecture2

fun main() {
    var input: String
    var number: Int
    input = readLine()!!
    val a: Int = input.toInt()
    input = readLine()!!
    val b: Int = input.toInt()

    val max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }

    val max2 = if (a > b) {
        a
    } else {
        b
    }

    var x:Int = 10
    while (x > 0) {
        println(x--)
    }

    do {
        print("Enter an integer: ")
        input = readLine()!!
        number = input.toInt()
    } while (number != 0)


}