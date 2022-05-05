package lecture10

// Kotlin Generics (mutiple type parameters)
interface Pair<K, V> {
    val key: K
    val value: V
}

internal class OrderedPair<K, V>
    (override val key: K, override val value: V) : Pair<K, V> {
}

fun main(args: Array<String>) {
    // Due to autoboxing, is it valid to pass a String and an int to the class.
    val p1: Pair<String, Int> = OrderedPair("Even", 8)
    val p2: Pair<String, String> = OrderedPair("hello", "world")

    // diamond notation
    val p3 = OrderedPair("Even", 8)
    val p4 = OrderedPair("hello", "world")
}


