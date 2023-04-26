package part2_2

fun getStr(): Nothing = throw Exception("예외 발생")

fun main() {
    val result = try {
        getStr()
    } catch (e: Exception) {
        println(e.message)
        "기본값"
    }

    println(result)

    val result2 = runCatching {
        getStr()
    }.getOrElse {
        println(it.message)
        "기본값"
    }

    println(result2)

    val result3: Nothing? = runCatching {
        getStr()
    }.getOrNull()

    println(result3)

    val result4 = runCatching {
        getStr()
    }.getOrDefault("기본값")
    println(result4)

    val result5 = runCatching { "안녕" }
        .map {
            "${it}하세요"
        }
        .getOrNull()
    println(result5)

    println(
        runCatching { getStr() }
            .recover { "복구" }
            .getOrNull()
    )
}