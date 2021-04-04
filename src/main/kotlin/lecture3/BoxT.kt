package lecture3

// generic type declaration
// T is type variable
class BoxT<T> (var obj:T) {
    fun get(): T {
        return obj
    }
}

fun main() {
    val integerBox = BoxT<Int>(10)
    //val integerBox2:BoxT<Int> = BoxT(10)

    integerBox.obj = 5
    val someInteger = integerBox.get()
    println(someInteger)
}

