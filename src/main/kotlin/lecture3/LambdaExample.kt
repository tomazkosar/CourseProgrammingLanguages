package lecture3

fun main() {
    val name1: (String) -> String = { str: String -> str.capitalize() } //explicit type definition
    val name2: (String) -> String = { str -> str.capitalize() }  // type inference inside lambda
    val name3 = { str: String -> str.capitalize() }        // type inference outside lambda
    // val upperCase4 = { str -> str.toUpperCase() }       // compiler needs type information
    val name5: (String) -> String = { it.capitalize() }   // implicit name of parameter
    val name6: (String) -> String = String::capitalize    // function pointer

    println(name1("tomaz"))
    println(name2("tomaz"))
    println(name3("tomaz"))
    println(name5("tomaz"))
    println(name6("tomaz"))
}

