package signiturepackage.course5.ch01

fun main() {
    val map = mapOf<String, Any>(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        Pair("key2", "value3"),
    )

    map.plus(Pair("key3", "value3"))

    println(map)

    val mutableMap = mutableMapOf<String, Any>(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        "key3" to "value3",
    )

    mutableMap["key4"] = "value4"
    println(mutableMap)

    val hashMap = hashMapOf<String, Any>(
        Pair("key1", "value1"),
        Pair("key2", "value2"),
        "key3" to "value3",
    )
    println(hashMap)
}