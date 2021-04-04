//arithmetic series
fun arithmeticSeriesSum(a: Int, n: Int, d: Int ): Int {
    return n/2 * (2*a + (n-1)*d)
}

//single line function, return type can be omitted
fun arithmeticSeriesTerm(a: Int, n: Int, d: Int) =  a + (n-1)*d

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Term 7: ${arithmeticSeriesTerm( 1, 7, d=2)}") // 1, 3, 5, 7, 9, 11, 13
        println("Sum 1-7: ${arithmeticSeriesSum(  d=2, n=7, a=1)}") // 1 + 3 + 5 + 7 + 9 + 11 + 13 = 42
    }
}

