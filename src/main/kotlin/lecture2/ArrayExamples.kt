package lecture2

fun test(){
    var a:Int = 1;
    {
        var a:Int = 2; //compiler
        println("a: $a")
    }
}

fun main() {
    test()

    val anArray = Array(10) { i -> i * 2 }

    for (i in anArray.indices)
        println("$i -> ${anArray[i]}")

    val anArray2 = arrayOf(10,20,30,40,50, 60, 70, 80, 90, 100, 120)

    for (i in 0..9)
        println("$i -> ${anArray2[i]}")

    for (i in 0 until anArray.size)
        println("$i -> ${anArray[i]}")


    var title:String
    title = "Mr."
    //title = 1;

    val million: Int = 1_000_000
    println (million)

    val intArray = intArrayOf(100, 200, 300, 400);
    intArray.forEach { println(it) }


}

