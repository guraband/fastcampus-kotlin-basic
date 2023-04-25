package part2_2

class DatabaseClient {
    var url: String? = null
    var username: String? = null
    var password: String? = null

    fun connect(): Boolean {
        println("접속중...")
        Thread.sleep(1_000)
        println("접속 완료")
        return true
    }
}

fun main() {
    // 일반적인 클래스 생성
    val config = DatabaseClient()
    config.url = "localhost:3306"
    config.username = "mysql"
    config.password = "1234"
    val connected = config.connect()
    println(connected)

    // run
    val configByRun = DatabaseClient().run {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(configByRun)

    // with
    val configByWith = with(DatabaseClient()) {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }
    println(configByWith)

    // apply
    val configByApply = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()   // apply는 마지막 라인을 결과로 리턴하지 않는다.
    }
    println(configByApply)
    println(configByApply.connect())
}