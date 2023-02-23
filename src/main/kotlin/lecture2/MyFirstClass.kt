package main.kotlin.lecture2

class MyFirstClass {
    private val initialized:Int = 0
    fun example1() {
        val noninitialized:Int
        //println("Non-initialized local variable: " + noninitialized)
        val example = MyFirstClass()
        println("Initialized local variable: " + example.initialized)
    }
    fun example2() {
        val anArray:IntArray   // definiramo polje celih števil
                               // Velikost polja ni del tipa (zato med [] ne zapišemo ničesar)

        anArray = IntArray(10) // alociramo pomnilnik za 10 celih števil
        anArray[0] = 100 // inicializacija prvega elementa
    }
    fun example3() {
        //agregat za inicializacijo polja
        val anArray = intArrayOf(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000)

        // lastnost size vrača velikost polja
        println(anArray.size)
    }
}

fun main(args:Array<String>) {
    val mfc = MyFirstClass()
    mfc.example1()
    mfc.example2()
    mfc.example3()
    //InstanceofDemo.example()
}
