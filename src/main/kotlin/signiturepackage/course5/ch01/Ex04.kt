package signiturepackage.course5.ch01

fun main() {
    val users = mutableListOf<TempUser>()
    users.add(TempUser("a", 10))
    users.add(TempUser("b", 20))
    users.add(TempUser("c", 30))

    val users2 = listOf<TempUser>(
        TempUser("d", 30),
        TempUser("e", 31),
        TempUser("f", 32),
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