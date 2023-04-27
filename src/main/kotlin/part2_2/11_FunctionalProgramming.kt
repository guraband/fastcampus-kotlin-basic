package part2_2

fun main() {
    val list = mutableListOf(printHello)
    list[0]()

    val func = list[0]
    func()

    call(printHello)

    printMessage3("Hi")

    println(plus(1, 2))

    println("")
    println("- 고차함수 예제")
    val printStr: (String) -> Unit = { println(it) }
    forEachStr(listOf("a", "b", "c"), printStr)

    println("")
    println("- 익명함수 예제")
    val func2 = anonymousFunc()
    func2()
}

val printHello: () -> Unit = { println("Hello") }

fun printHello2() {
    println("Hello")
}

// 함수를 인자로 받아 실행하는 함수
fun call(block: () -> Unit) {
    block()
}

val printMessage: (String) -> Unit = { message: String -> println(message) }
val printMessage2: (String) -> Unit = { message -> println(message) }
val printMessage3: (String) -> Unit = { println(it) }

val plus: (Int, Int) -> Int = { a, b -> a + b }

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

fun anonymousFunc(): () -> Unit = { println("이것은 익명함수") }