package signiturepackage.course5.ch01

fun main() {
    val users = mutableListOf<User>()
    users.add(User("a", 10))
    users.add(User("b", 20))
    users.add(User("c", 30))

    val users2 = listOf<User>(
        User("d", 30),
        User("e", 31),
        User("f", 32),
    )

    users.forEachIndexed { index, user ->
        println("$index) name : ${user.name}, age : ${user.age}")
    }

    for ((index, user) in users2.withIndex()) {
        println("$index) name : ${user.name}, age : ${user.age}")
    }
}

class User(
    var name: String,
    var age: Int,
)