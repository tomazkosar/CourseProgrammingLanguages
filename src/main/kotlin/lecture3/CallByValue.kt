package lecture3

class X {
    var name:String = ""
}
class CallByValue {
    fun test1(a: X) {
        a.name = "foo" // change will be visible outside method
    }

    fun test2(a: X, b: X) {
        //a = b // change is not possible
        a.name = b.name
    }
}

fun main() {
    val first = X()
    val second = X()
    first.name = "Tomaz"
    second.name = "Matej"
    val call = CallByValue()
    call.test1(first)
    println(first.name)
    call.test2(first, second)
    println(first.name)
}
