package lecture3

interface InterfaceA {
    fun a()
}

interface InterfaceB {
    fun b()
    //fun a();
    //fun a():Int;
    fun a(x: Int)
}

//dedovanje vmesnikov
interface InterfaceAB : InterfaceA, InterfaceB

class MyClassC : InterfaceAB {
    override fun a() {
        println("a")
    }

    override fun b() {
        println("b")
    }

    override fun a(x: Int) {
        println("a $x")
    }
}

fun main() {
    val firstObj = MyClassC()
    firstObj.a()
    firstObj.b()
}

