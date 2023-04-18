package part2_2

class Person(val name: String, val age: Int)
data class DataPerson(val name: String, val age: Int)

fun main() {
    val person1 = Person("Bart", 12)
    val person2 = Person("Bart", 12)

    val dataPerson1 = DataPerson("Bart", 12)
    val dataPerson2 = DataPerson("Bart", 12)

    println("\n- equals")
    println(person1 == person2)
    println(dataPerson1 == dataPerson2)

    println("\n- hashcode")
    println(hashSetOf(person1).contains(person2))
    println(hashSetOf(dataPerson1).contains(dataPerson2))

    println("\n- toString")
    println(person1.toString())
    println(dataPerson1.toString())
}