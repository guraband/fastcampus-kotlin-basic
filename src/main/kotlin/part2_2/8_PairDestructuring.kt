package part2_2

data class Tuple(val a: Int, val b: Int)

fun plusUsingTuple(tuple: Tuple) = tuple.a + tuple.b

fun plus(pair: Pair<Int, Int>) = pair.first + pair.second

fun concat(pair: Pair<Int, String>) = pair.first.toString() + pair.second

fun main() {
    var plus = plusUsingTuple(Tuple(1, 3))
    println(plus)

    plus = plus(Pair(1, 2))
    println(plus)

    println(concat(Pair(777, "문자열")))

    val triple = Triple("a", "b", "c")
    println(triple.first)
    println(triple.second)
    println(triple.third)
    println(triple.component1())

    // Pair, Triple의 각 변수들은 data class에 val로 선언되어있기 때문에 직접 수정할 수 없음
    val newTriple = triple.copy(first = "A")
    println(newTriple)

    println("")
    println("- 구조 분해 할당")
    val (a, b, c) = newTriple
    println("$a, $b, $c")

    val list = listOf("item1", "item2")
    val (i1, i2) = list
    println("$i1, $i2")

    println("")
    println("- 구조 분해 할당 (map)")
    val map = mutableMapOf("key1" to "value1", "key2" to "value2")
    for ((key, value) in map) {
        println("map[$key] = $value")
    }
}