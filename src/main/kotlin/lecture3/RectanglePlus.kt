package lecture3

import lecture2.Point

interface Relatable {
    // returns 1, 0, -1 if this is greater
    // than, equal to, or less than other
    fun isLargerThan(other: Relatable): Int
}

class RectanglePlus(_x: Int, _y: Int, _w: Int, _h: Int) : Relatable {
    var width = _w
    var height = _h
    var origin: Point = Point(_x, _y)

    private fun getArea(): Double = width * height

    override fun toString(): String {
        return ("RectanglePlus{" +
                "width=" + width +
                ", height=" + height +
                ", origin=" + origin.toString() +
                '}')
    }

    // a method required to implement the Relatable interface
    override fun isLargerThan(other: Relatable): Int {
        val otherRect = other as RectanglePlus
        return when {
            this.getArea() < otherRect.getArea() -> -1
            this.getArea() > otherRect.getArea() ->  1
            else -> 0
        }
    }
}

fun findLargest(object1: Any, object2: Any): Any {
    val obj1 = object1 as Relatable
    val obj2 = object2 as Relatable
    return if (obj1.isLargerThan(obj2) > 0) object1
    else object2
}

fun main() {
    val firstObj = RectanglePlus(2, 3, 6, 3)
    val secondObj = RectanglePlus(8, 6, 5, 4)
    println((findLargest(firstObj, secondObj) as RectanglePlus).toString())
}

