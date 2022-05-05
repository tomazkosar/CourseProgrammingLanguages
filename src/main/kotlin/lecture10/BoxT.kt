package lecture10

class BoxT<T> {
    private var obj: T? = null // T stands for "Type"
    fun add(o: T) { this.obj = o  }
    fun get(): T? { return obj }
}

fun main() {
    // generic type invocation
    val integerBox: BoxT<*>

    // object creation
    integerBox = BoxT<Any?>()
    //integerBox = BoxT<Int>();
    integerBox.add(10)
    val someInteger = integerBox.get() as Int // cast!
    println(someInteger)
}