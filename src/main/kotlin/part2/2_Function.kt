package part2

// 기본적인 함수 선언 스타일
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 표현식 스타일
fun sum2(a: Int, b: Int): Int = a + b

// 표현식 & 반환 타입 생략
fun sum3(a: Int, b: Int) = a + b

// 반환타입이 없는 함수는 Unit 반환한다.
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

// default parameter
fun greeting(message: String = "Hello!") {
    println(message)
}

// named argument
fun log(level: String = "INFO", message: String) {
    println("[$level] $message")
}

fun main() {
    printSum(1, 2)

    greeting()
    greeting("Hi!")

    println()

    log(message = "로그 메시지")
    log(message = "경고 로그", level = "WARN")
    log("ERROR", "에러 로그")
}
