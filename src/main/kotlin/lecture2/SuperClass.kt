package lecture2

// Klic prekritih (overriding) metod je mogoč preko super
open class SuperClass {
    open fun printMethod() {
        println("Printed in Superclass.")
    }
}

class SubClass : SuperClass() {
    override fun printMethod() { //overrides printMethod in Superclass
        super.printMethod()
        println("Printed in Subclass")
    }
}

fun main() {
    val s = SubClass()
    s.printMethod()
}

