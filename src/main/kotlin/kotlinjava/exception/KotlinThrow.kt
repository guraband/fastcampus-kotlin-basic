package kotlinjava.exception

import java.io.IOException

class KotlinThrow {
    @Throws(IOException::class) // java의 throw IOException 전파와 같은 용도
    fun throwIOException() {
        throw IOException()
    }
}

fun main() {
    val javaThrow = JavaThrow()
    javaThrow.throwIOException()

    val kotlinThrow = KotlinThrow()
    kotlinThrow.throwIOException()

    println("Finished")
}