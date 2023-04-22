package part2_2

fun String.first(): Char {
    return this[0]
}

fun String.addPrefix(string: String): String {
    return string + this
}

class MyExample {
    fun print() = println("클래스 출력")
}

// 동일한 이름의 메소드를 선언할 경우 멤버 메소드가 우선시 됨
fun MyExample.print() = println("확장 출력")

fun MyExample?.printNullOrNotNull() {
    if (this == null) {
        println("null인 경우 출력")
    } else {
        println("not null인 경우 출력")
    }
}

fun main() {
    val s = "abcde"

    println(s.first())
    println(s.addPrefix("new_"))
    MyExample().print()

    var myExample: MyExample? = null
    myExample.printNullOrNotNull()  // 내부에 null 체크를 하고 있으므로 myExample? 대신 myExample을 사용해도 컴파일 오류가 발생하지 않음

    myExample = MyExample()
    myExample.printNullOrNotNull()
}