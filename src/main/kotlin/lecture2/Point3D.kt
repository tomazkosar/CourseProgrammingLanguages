package lecture2

open class Point2D{
    var x: Int
    var y: Int
    constructor(_x:Int = 0, _y:Int = 0){
        x = _x
        y = _y
    }
}

class Point3D: Point2D{
    var z:Int
    constructor(_x:Int, _y:Int): this (_x, _y, 0){
    }
    constructor(_x:Int, _y:Int, z:Int): super (_x, _y){
        this.z = z
    }

}

fun main(){
    val p1 = Point2D(5, 4)

    val p2 = Point3D(5, 4 )
    val p3 = Point3D(5, 4, 3)
}

