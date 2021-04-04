package lecture3

object DataID {
    private var id: Int = 0
    fun current() = id
    fun next() =  ++id
}

fun main(args: Array<String>) {
    DataID.next()
    DataID.next()
    DataID.next()
    println(DataID.current())
}

