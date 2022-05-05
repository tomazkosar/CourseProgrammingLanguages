package lecture10

internal open class A {
    open var a = 0
}

internal class B : A() {
    //override var a = false
    fun print() {
        println(a)
        println(super.a)
    }
}

fun main(args: Array<String>) {
    val a = A()
    val b = B()
    val c: A = B()
    println(a.a) // 0
    println(b.a) // false
    println(c.a) // 0 tip reference (statični in ne dinamični tip)
    // določa do katere instančne spremenljivke dostopamo
    b.print()
}