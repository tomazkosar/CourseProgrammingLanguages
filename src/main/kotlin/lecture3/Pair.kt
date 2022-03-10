package lecture3

// Kotlin Generics (multiple type parameters)
interface Pair<K, V> {
    val key: K
    val value: V
}

internal class OrderedPair<K, V>(key: K, value: V) : Pair<K, V> {
    override val key: K = key
    override val value: V = value
}

fun main(args: Array<String>) {
    val p1:OrderedPair<String, Int> = OrderedPair<String, Int>("Even", 8)
    val p2:OrderedPair<String, String> = OrderedPair<String, String>("hello", "world")
    val p3:OrderedPair<String, Int> = OrderedPair("Even", 8)
    val p4:OrderedPair<String, String> = OrderedPair("hello", "world")
}

