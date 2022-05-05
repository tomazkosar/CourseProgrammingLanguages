package lecture12

fun printMe(anotherFunction: () -> Unit) {
    anotherFunction()
}

fun main() {
    //passing lambda to function
    printMe ({ println("Hello from high-order function!") })

    //passing function to function
    val functionWithoutParam = { println("Inside") }
    printMe (functionWithoutParam)

}

