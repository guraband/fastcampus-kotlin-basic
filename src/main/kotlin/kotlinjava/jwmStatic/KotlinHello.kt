package kotlinjava.jwmStatic

import kotlinjava.exception.KotlinThrow

class KotlinHello {
    companion object {
        @JvmStatic
        fun hello() = "Hello!"
    }
}

object Hi {
    @JvmStatic
    fun hi() = "Hi!"
}

fun main() {
    println(KotlinHello.hello())
    println(Hi.hi())
}