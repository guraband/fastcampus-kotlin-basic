package kotlinjava.extensions

fun String.first(): Char {
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

fun main() {
    val s = "ABCDE"
    println(s.first())
    println(s.addFirst('Z'))
}