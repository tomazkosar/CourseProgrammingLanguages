package lecture9

fun main() {
    val myNumbers = intArrayOf(1, 2, 3)
    try {
        for (i in 0..myNumbers.size) {
            println(myNumbers[i])
        }
        println("This will not be printed")
    }
    catch(e:IndexOutOfBoundsException){
        println("Out of bounds!");
    }
    finally{
        println("This is finally block");
    }
    println("Out of try-catch-finally block");
}

