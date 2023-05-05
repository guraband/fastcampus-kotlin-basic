package kotlinjava.gettersetter

import java.time.LocalDate

class Student {
    var name: String? = null
    var birthDate: LocalDate? = null

    @JvmField   // getter, setter가 아닌 직접 접근 가능
    var gender: Gender? = null

    var grade: String? = null
        private set // 외부에서 setter 사용 방지

    fun changeGrade(grade: String) {
        this.grade = grade
    }
}

data class DataStudent(var name: String?, var birthDate: LocalDate?)

enum class Gender {
    MALE, FEMALE
}