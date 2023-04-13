package part2

fun main() {
    val job = "BE"

    if (job == "BE") {
        println("백엔드 개발자")
    } else {
        println("백엔드 아님")
    }

    // 코틀린의 if - else는 표현식

    val age = 10

    val str = if (age > 18) {
        "성인"
    } else {
        "아이"
    }

    println(str)
    println(
        if (age > 18) {
            "성인"
        } else {
            "아이"
        }
    )

    // 코틀린은 삼항연산자가 없음
    val a = 1
    val b = 2
    val c = if (a > b) a else b
    println(c)

}