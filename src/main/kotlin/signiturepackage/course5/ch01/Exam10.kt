package signiturepackage.course5.ch01

// 확장 함수 예제
fun main() {
    var examUser = ExamUser("abcd")
    exam10(examUser)
}

fun exam10(examUser: ExamUser?) {
    if (examUser.isNotNull() && examUser!!.name.isNotNullOrBlank()) {
        println(examUser?.name)
    }
}

data class ExamUser(
    var name: String? = null
)

fun String?.isNotNullOrBlank(): Boolean {
    return !this.isNullOrBlank()
}

fun Any?.isNotNull(): Boolean {
    return this != null
}