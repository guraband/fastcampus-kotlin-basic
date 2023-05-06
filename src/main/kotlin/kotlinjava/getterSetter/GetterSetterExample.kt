package kotlinjava.getterSetter

fun main() {
    val javaStudent = JavaStudent()
    javaStudent.name = "James"
    javaStudent.age = 19
    javaStudent.setAddress("Seoul")

    println("- name : ${javaStudent.getName()}, age : ${javaStudent.getAge()}")
    println("- name : ${javaStudent.name}, age : ${javaStudent.age}")
    println("- uuid : ${javaStudent.uuid}") // getter만 있으면 프로퍼티가 없어도 프로퍼티처럼 사용 가능
}