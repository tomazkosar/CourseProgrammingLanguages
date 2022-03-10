package lecture2

/*
class Point(var x: Int = 0, var y: Int = 0)
*/

/*
class Point(_x: Int, _y: Int) {
    var x:Int = _x
    var y:Int = _y
}
*/

/*
class Point(x: Int  = 0, y: Int = 0) {
    var x: Int = x
        get() = field
        set(value) {
            field = value
        }

    var y: Int = y
        get() = field
        set(value) {
            field = value
        }
}*/


/*class Point(x: Int, y: Int) {
    var x:Int = x
        get() = field
        private set

    var y:Int = y
        get() = field
        private set
}

fun main() {
    val p1 = Point(4, 5)
//    p1.x = 5
}*/



class Point(var x: Int = 0, var y: Int = 0) {
    override fun toString(): String = "($x, $y)"
}

fun main() {
    val p1 = Point()
    print(p1.toString())
}


