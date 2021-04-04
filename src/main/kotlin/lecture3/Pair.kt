package lecture3

// Kotlin Generics (mutiple type parameters)
interface Pair<K, V> {
    val key: K
    val value: V
}

internal class OrderedPair<K, V>(_key: K, _value: V) : Pair<K, V> {
    override val key: K = _key
    override val value: V = _value
}

fun main(args: Array<String>) {
    val p1:OrderedPair<String, Int> = OrderedPair<String, Int>("Even", 8)
    val p2:OrderedPair<String, String> = OrderedPair<String, String>("hello", "world")
    val p3:OrderedPair<String, Int> = OrderedPair("Even", 8)
    val p4:OrderedPair<String, String> = OrderedPair("hello", "world")
}
