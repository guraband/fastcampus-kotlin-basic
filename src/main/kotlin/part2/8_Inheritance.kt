package part2

open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

class Bulldog(override var age: Int = 0) : Dog() {
    override fun bark() {
        println("컹컹")
        super.bark()
    }
}

abstract class Developer {
    abstract var age: Int
    abstract var language: String
    abstract fun coding()
}

class BackendDeveloper(override var age: Int, override var language: String) : Developer() {
    override fun coding() {
        println("$language 언어로 코딩중...")
    }
}

fun main() {
    val dog = Bulldog()

    dog.bark()

    BackendDeveloper(22, "Java").coding()
}