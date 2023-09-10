package signiturepackage.course5.ch01

import java.util.function.Predicate

// 고차 함수 예제
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val predicate = object : Predicate<Int> {
        override fun test(t: Int): Boolean {
            return t % 2 == 0
        }
    }

    val evens = numbers.stream()
        .filter(predicate)
        .toList()
    println(evens)

    val evens2 = numbers.filter { it % 2 == 0 }
    println(evens2)

    val add = { x: Int, y: Int -> x + y }
    println(add(2, 3))

    println(lambda(2, 3, add))
}

fun lambda(x: Int, y: Int, method: (Int, Int) -> Int): Int {
    return method(x, y)
}