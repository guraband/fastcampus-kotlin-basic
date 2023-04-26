package part2_2

import java.io.FileWriter

fun main() {
    FileWriter("test.txt")
        .use {
            it.write("Hello Kotlin")
        }
}