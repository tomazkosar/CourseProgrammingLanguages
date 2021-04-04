package lecture3

// Generic methods
class BoxMethod<T> (var t:T){
    fun <U> inspect(u:U) {
        println("T: " + t!!::class.simpleName)
        println("U: " + u!!::class.simpleName)
    }
}
fun main() {
    val integerBox = BoxMethod<Int>(10)
    integerBox.inspect<String>("some text") //type inference
    integerBox.inspect(false);
}
