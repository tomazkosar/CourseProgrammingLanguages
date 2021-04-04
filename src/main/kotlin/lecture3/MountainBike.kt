package lecture3

class MountainBike(var seatHeight:Int = 0, startGear:Int = 1, startSpeed:Int = 0):Bicycle(startGear, startSpeed) {
}

fun main () {
    // obj: statični tip je Any, dinamični tip MountainBike
    val obj:Any = MountainBike(0,1,0)

    //var myBike:MountainBike = obj // compile-time error
    var yourBike:MountainBike = obj as MountainBike
    // This cast inserts a runtime check that obj is assigned a MountainBike
    // so that the compiler can safely assume that obj is a MountainBike.
}
