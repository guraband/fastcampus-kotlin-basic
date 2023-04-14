fun main() {
    // try - catch를 강제하지 않음
    Thread.sleep(1_000)

    val result =
        try {
            Thread.sleep(1_000)
            "try"
        } catch (e: Exception) {
            println("Exception 발생")
            "catch"
        } finally {
            println("finally")
        }

    println(result)
}