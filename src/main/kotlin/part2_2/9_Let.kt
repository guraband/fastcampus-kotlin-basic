package part2_2

fun main() {
    var str: String? = "hello~"

    val result = str?.let {
        println(it)

        1234
    }

    println("result : $result")
}