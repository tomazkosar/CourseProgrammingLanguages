package lecture2

// Skrivanje instančnih spremenljivk - VariableShadow
open class A {
    var a: Int = 0
    open fun print(){
        println ("Class A: $a")
    }
}

class B : A() {
    //var a: Boolean = true
    override fun print() {
        println("Class B: ${super.a}")
    }
}

fun main() {
    val a = A()
    val b = B()
    val c:A = B()
    a.print();
    b.print();
    c.print();

    println(a.a) // 0
    println(b.a) // false
    println(c.a) // 0
    // tip reference (statični in ne dinamični tip)
    // določa do katere instančne spremenljivke dostopamo
    b.print()
}