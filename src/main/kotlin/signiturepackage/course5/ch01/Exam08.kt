package signiturepackage.course5.ch01

import java.time.LocalDateTime

fun main() {
    val exam08 = Exam08()
}

class Exam08 {
    constructor() {
        toLocalDateTimeString(null)
        toLocalDateTimeString()
    }

    private fun toLocalDateTimeString(
        localDateTime: LocalDateTime? = LocalDateTime.of(2023, 9, 12, 22, 15, 30)
    ) {
        val temp = localDateTime ?: LocalDateTime.now()
        println(temp)
    }
}