package lecture2

class Box {
    private var obj: Any = true // boolean
    fun add(obj: Any) {
        this.obj = obj
    }

    fun get(): Any {
        return obj
    }
}

fun main() {
    // place Integer objects into this box!
    val anyBox = Box()
    val someBool:Boolean = anyBox.get() as Boolean
    println(someBool) // float
    // modify type
    anyBox.add(10)
    val someInteger = anyBox.get()
    println(someInteger)
    // modify type again
    anyBox.add("text") // note how the type is now String
    val stringBox = anyBox.get()
    println(stringBox)
}

