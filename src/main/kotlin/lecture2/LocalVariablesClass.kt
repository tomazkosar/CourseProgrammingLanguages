package main.kotlin.lecture2

class LocalVariablesClass {
        internal val initialized:Int = 0
}

fun main(args:Array<String>) {
    val uninitialized:Int
    //println("Non-initialized local variable: " + uninitialized)

    val example = LocalVariablesClass()
    println("Initialized local variable: " + example.initialized)
}

