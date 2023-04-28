package part2_2

fun main() {
    val printStr: (String) -> Unit = { println(it) }
    val list = listOf("a", "b", "c")
    forEachStr(list, printStr)

    // 마지막 인자의 타입이 함수이면 아래와 같이 후행 람 다 형식으로 사용 가능
    forEachStr(list) {
        println(it)
    }

    // Lambda Reference
    val callReference: () -> Unit = { printHello() }
    callReference()

    val callReference2 = ::printHello
    callReference2()()

    val numStringList = listOf("1", "2", "3")
    numStringList.map { it.toInt() }.forEach { println(it) }
    numStringList.map(String::toInt).forEach(::println)
}