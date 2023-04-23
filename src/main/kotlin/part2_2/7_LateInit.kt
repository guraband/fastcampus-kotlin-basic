package part2_2

class LateInit {
    lateinit var text: String

    val isTextInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
        text = "안녕하세요"
        println(this::text.isInitialized)
        println(text)
    }
}

fun main() {
    val test = LateInit()
    println(test.isTextInitialized)
    test.printText()
}