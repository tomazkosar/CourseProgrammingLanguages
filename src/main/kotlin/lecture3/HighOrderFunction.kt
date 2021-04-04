package lecture3

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

inline fun sum(x: Int, y: Int) = x + y

fun main() {
    val a:Int = 5;
    val b:Int = 4;
    val sumResult = calculate(a, b, ::sum)            //
    val mulResult = calculate(a, b) { a, b -> a * b } //
    println("sumResult $sumResult, mulResult $mulResult")

    val result = (if (a>b) calculate else multResult) (a, b, ::sum)
}

