package main.kotlin.lecture2

class Circle(var x:Int = 0, var y:Int = 0, var radius:Int = 0) {
    fun setOrigin(x:Int, y:Int) {
        //"this" is a reference to the current object
        this.x = x
        this.y = y
    }
}
fun main (){
    val c1 = Circle()
    c1.setOrigin(4,5)
}


