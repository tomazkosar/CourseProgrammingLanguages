package lecture2

open class Point2D{
    var x: Int
    var y: Int
    constructor(ax:Int = 0, ay:Int = 0){
        x = ax
        y = ay
    }
}

class Point3D: Point2D{
    var z:Int
    constructor(x:Int, y:Int): this (x, y, 0){
    }
    constructor(x:Int, y:Int, z:Int): super (x, y){
        this.z = z
    }
}

fun main(){
    val p1 = Point2D(5, 4)

    val p2 = Point3D(5, 4 )
    val p3 = Point3D(5, 4, 3)
}

