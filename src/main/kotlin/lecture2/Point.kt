package lecture2



/*
class Point(_x: Int, _y: Int) {
    var x:Int = _x
    var y:Int = _y
}
*/


/*
class Point(_x: Int, _y: Int) {
    var x:Int = _x
    get() = field
    set(value) { field = value }

    var y:Int = _y
    get() = field
    set(value) { field = value }
}
*/

/*
class Point(_x: Int, _y: Int) {
    var x:Int = _x
        get() = field
        private set

    var y:Int = _y
        get() = field
        private set
}

fun main() {
    val p1 = Point(4, 5)
    p1.x = 5
}
*/


/*
class Point(_x: Int, _y: Int) {
    var x:Int = _x
    var y:Int = _y
    override fun toString():String {
        return "Point { x=  $x, y= $y }"
    }
}
*/

class Point(var x: Int = 0, var y: Int = 0) {
    override fun toString(): String = "($x, $y))"

}

fun main() {
    val p1 = Point()
    print(p1.toString())
}

