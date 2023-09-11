package signiturepackage.course5.ch01

fun main() {
    val dog = Dog("멈무")
    dog.bark()
    dog.eat()
}

interface Bark {
    fun bark()
}

abstract class Animal(
    private val name: String? = ""
) : Bark {
    fun eat() {
        println("${name}이(가) 식사를 시작합니다.")
    }
}

class Dog(
    private val name: String? = ""
) : Animal(name) {
    override fun bark() {
        println("$name : 멍멍")
    }
}