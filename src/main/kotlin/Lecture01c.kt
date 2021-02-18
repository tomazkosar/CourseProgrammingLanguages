fun arithmeticSeries(a: Int = 1, n: Int, d: Int = 1): Pair<Int, Int> {
    val term =  a + (n-1)*d
    val sum = n/2 * (2*a + (n-1)*d)
    return Pair(term, sum)
}

fun main() {
    val (term, sum) =  arithmeticSeries(1, 7, 2)
    print("Term: $term, sum:$sum")
}

