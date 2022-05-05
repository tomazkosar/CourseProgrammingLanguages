package lecture8

fun sum(vararg args:Int):Int {
    var total = 0
    println("Number of arguments: " + args.size)
    for (number in args)
        total += number
    return total
}

fun main() {
    println("Sum: ${sum(100)}\n")       //one
    println("Sum: ${sum(1, 2, 3, 4)}\n") //four
    println("Sum: ${sum()}\n")           //no argument
}


