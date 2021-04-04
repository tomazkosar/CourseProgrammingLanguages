package lecture3

open class Bicycle(var gear: Int = 1, var speed: Int = 0) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }
}

fun main() {
    val mikeBike: Bicycle
    val myBike = Bicycle(8, 0)
    val yourBike = Bicycle()

    myBike.speed += 100
    myBike.applyBrake(10)
    val startGear = Bicycle().gear

    var a: Int = 10
    var anArray: IntArray
    var b: Bicycle
    var c: Bicycle = Bicycle()
}

