package lecture2

internal class Polygon
//class Point {}
internal class TestPolygon {
    private var somePolygon:Polygon = Polygon()
    fun polygonFrom(corners:Array<Point>):Polygon {
        // method body goes here
        return somePolygon
    }
}
fun main() {
        val test = TestPolygon()
        val c = arrayOf<Point>(Point(1, 2), Point(2, 3))
        test.polygonFrom(c)
}

