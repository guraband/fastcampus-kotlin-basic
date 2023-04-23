package part2_2

class HelloBot {
    val greeting: String by lazy(
//        LazyThreadSafetyMode.NONE   // Thread Safe 해제
    ) {
        println("초기화 로직 수행")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {
    val helloBot = HelloBot()

    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()
    }
}