package part2_2

import java.time.LocalDateTime

object Singleton {
    val a = 123

    fun printA() = println(a)
}

object DatetimeUtils {
    val now: LocalDateTime = LocalDateTime.now()

    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    fun same(a: LocalDateTime, b: LocalDateTime): Boolean {
        return a == b
    }
}

class MyClass private constructor() {

    companion object {
        val a = 1234

        private var myClass = MyClass()
        fun newInstance(): MyClass {
            return myClass
        }
    }

    val b = 456
}

fun main() {
    println(Singleton.a)
    Singleton.printA()

    println(DatetimeUtils.now)
    println(DatetimeUtils.now)
    println(DatetimeUtils.now)
    println(DatetimeUtils.DEFAULT_FORMAT)

    val now = LocalDateTime.now()
    DatetimeUtils.same(now, now)

    println()
    println("# Companion Object")
    println(MyClass)
    println(MyClass.a)
    println(MyClass.newInstance())
    println(MyClass.Companion.newInstance())

    val myClass = MyClass.newInstance()
    println(myClass.b)
}