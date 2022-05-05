package lecture10

class DataArtist {
    fun draw(s: String?) {}
    fun draw(i: Int) {}
    fun draw(f: Double) {}
    fun draw(i: Int, f: Double) {}
    //fun draw(i: Int): Int {} // compile error
}