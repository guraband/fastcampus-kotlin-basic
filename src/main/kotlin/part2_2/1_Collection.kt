package part2_2

import java.util.ArrayList
import java.util.LinkedList

fun main() {
    // immutable
    val currencyList = listOf("달러", "유로", "원")
//    currencyList.add()    // add 불가

    val mutableCurrencyList = mutableListOf<String>()
    mutableCurrencyList.add("달러")
    mutableCurrencyList.add("유로")
    mutableCurrencyList.add("원")

    val mutableCurrencyList2 = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    // immutable set
    val numberSet = setOf(1, 2, 3, 4, 5)

    // mutable set
    var mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    // immutable map
    val numberMap = mapOf("one" to 1, "two" to 2)
    println(numberMap)

    // mutable map
    val mutableNumberMap = mutableMapOf<String, Int>()
    mutableNumberMap["one"] = 1
    mutableNumberMap["two"] = 2
    mutableNumberMap["three"] = 3

    // collection builder
    val numberList = buildList {
        // mutable list로 생성 후 immutable list로 반환
        add(1)
        add(2)
        add(3)
    }

    // linkedList
    val linkedList = LinkedList<Int>().apply {
        addFirst(1)
        addLast(2)
        add(3)
    }

    println(linkedList)

    var arrayList = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    val iterator = arrayList.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    for (n in linkedList) {
        println(n)
    }

    currencyList.forEach {
        println(it)
    }

    println("\n- map")
    val lowerList = listOf("a", "b", "c")
    val upperList = mutableListOf<String>()
    for (lowerCase in lowerList) {
        upperList.add(lowerCase.uppercase())
    }

    println(upperList)
    println(lowerList.map { it.uppercase() })

    println("\n- filter")
    val filteredList = mutableListOf<String>()
    for (upperCase in upperList) {
        if (upperCase == "A" || upperCase == "C") {
            filteredList.add(upperCase)
        }
    }

    println(filteredList)
    println(upperList.filter { it == "A" || it == "C" })
}