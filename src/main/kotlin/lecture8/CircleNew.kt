package lecture8

class CircleNew(var x:Int = 0, var y:Int = 0, var radius:Int = 0) {
    fun setOrigin(x:Int, y:Int) {
        //"this" is a reference to the current object
        this.x = x
        this.y = y
    }
}
fun main (){
    val c1 = CircleNew()
    c1.setOrigin(4,5)
    c1.setOrigin(y=4,x=5)
}


