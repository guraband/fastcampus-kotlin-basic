fun main() {

    val a: String? = null
    val b = null
    println(a?.length)
//    println(b?.length)

    val aLen = if (a != null) a.length else 0
    println(aLen)
    println(a?.length ?: 0)

    val c: String? = null
    println(c!!.length)
}
