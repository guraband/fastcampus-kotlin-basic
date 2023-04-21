package part2_2

sealed class Developer {
    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("$language 언어를 사용하는 백엔드 개발자")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {
    override fun code(language: String) {
        println("$language 언어를 사용하는 프론트엔드 개발자")
    }
}

object OtherDeveloper : Developer() {
    override val name: String = "익명"

    override fun code(language: String) {
    }
}

object DeveloperPool {
    val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when (developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자 타입입니다.")
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper("Tonny")
    val frontendDeveloper = FrontendDeveloper("Steve")

    DeveloperPool.add(backendDeveloper)
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("Tonny"))
    println(DeveloperPool.get("Jarvis"))
    DeveloperPool.get("Tonny")?.code("Java")
}