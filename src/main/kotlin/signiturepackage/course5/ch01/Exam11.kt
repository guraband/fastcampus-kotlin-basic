package signiturepackage.course5.ch01

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// let, run 예제

fun main() {
    val now = LocalDateTime.now()
    val nullNow: LocalDateTime? = null

    val nowStr = now?.let {
        println(now)
        it.second
    } ?: LocalDateTime.now().toString()

    println(nowStr::class.simpleName)

    val d = nullNow?.let {
        it.minusMinutes(3)
        it.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    } ?: run {
        LocalDateTime.now()
    }

    println(d)
}