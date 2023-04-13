package part2

fun main() {
    println("# 0 .. 3")
    for (i in 0..3) {
        println(i)
    }

    println("# 0 until 3")
    for (i in 0 until 3) {
        println(i)
    }

    println("# 0 .. 6 step 2")
    for (i in 0..6 step 2) {
        println(i)
    }

    println("# 6 downTo 0 step 2")
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    println("# 배열을 반복")
    val numbers = arrayOf(1, 2, 3)
    for (i in numbers) {
        println(i)
    }
}