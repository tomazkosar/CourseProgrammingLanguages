package lecture12

fun tripleText(s: String) : String{
    return s+s+s
}

fun main() {
    //1. named function
    println(tripleText("Text "))

    //2. function expression
    var triple = fun (s: String): String { return s + s + s }
    //function is a value
    var another = triple
    println(another("AnotherText "))

    //3. lambda here
    var firstGreeting: () -> String = { "No parameter " + "No parameter " + "No parameter " }
    println(firstGreeting())

    //4. lambda here - no parameters
    var secondGreeting = { "Hello! " + "Hello! " + "Hello! " }
    println(secondGreeting())

    //5. lambda here
    var andAgain: (String) -> String = { s:String -> s + s + s}
    println(andAgain("And again "))

    //6. lambda here
    var andAgain2 = { s:String -> println(s + s + s)}
    andAgain2("And again ")

}
