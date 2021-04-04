package lecture3

// Generic methods
class BoxBounded<T> (var t:T){
    fun <U:Number> inspect(u:U) {
        println("T: " + t!!::class.simpleName)
        println("U: " + u!!::class.simpleName)
    }
}
fun main() {
    val integerBox = BoxBounded(10)
    integerBox.inspect<Double>(10.5)
    integerBox.inspect<Byte>(10);
    //integerBox.inspect<String>("some text") //error
}

