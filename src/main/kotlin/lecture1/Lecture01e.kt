fun main() {
    val colors = arrayOf<String>("RED","GREEN", "BLUE")
    val color: String = colors[1]  // red or green?

    when (color) {
        "RED" -> println ("it is red")
        "GREEN" -> println ("it is green")
        "BLUE" -> println("it is blue")
        else -> println("Unknown color")
    }
}

