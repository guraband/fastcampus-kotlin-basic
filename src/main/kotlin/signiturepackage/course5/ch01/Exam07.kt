package signiturepackage.course5.ch01

fun main() {
    val user = TempUser(name = "바트", age = 12, email = "aaa@bbb.ccc")
    val user2 = user.copy(name = "리사")
    println(user)
    println(user2)
}

