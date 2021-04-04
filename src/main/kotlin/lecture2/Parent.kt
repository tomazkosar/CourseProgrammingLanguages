    package lecture2

    internal interface MyInterface
    open class Parent
    internal class Child: Parent(), MyInterface { }

    fun example() {
        val obj1 = Parent()
        val obj2 = Child()
        println(("obj1 instance of Parent: " + (obj1 is Parent)))
        println(("obj1 instance of Child: " + (obj1 is Child)))
        println(("obj1 instance of MyInterface: " + (obj1 is MyInterface)))
        println(("obj2 instance of Parent: " + (obj2 is Parent)))
        println(("obj2 instance of Child: " + (obj2 is Child)))
        println(("obj2 instance of MyInterface: " + (obj2 is MyInterface)))
    }
    fun main() {
        example()

        var i = 5
        i = 5 + -i
        println(i)
    }

