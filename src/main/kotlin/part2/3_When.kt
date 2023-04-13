package part2

fun main() {
    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        else -> "기타"
    }
    println(result)

    // else를 생략할 수 있다.
    when (getColor()) {
        Color.RED -> println("빨간색")
        Color.GREEN -> println("녹색")
    }
}

enum class Color {
    RED, GREEN
}

fun getColor() = Color.RED