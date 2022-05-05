package lecture10

import kotlin.jvm.JvmStatic

class Box {
    private var obj: Any? = null
    fun add(obj: Any?) {
        this.obj = obj
    }

    fun get(): Any? {
        return obj
    }
}

fun main(args: Array<String>) {
    val integerBox = Box()
    integerBox.add(10)
    val someInteger = integerBox.get() as Int?
    println(someInteger)

    integerBox.add("10") // note how the type is now String
    val anotherInteger = integerBox.get() as String?
    println(anotherInteger)
}
