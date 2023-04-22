package part2_2

class MyGenerics<out T>(val t: T)
class MyGenerics2<in T>(val t: @UnsafeVariance T)

fun main() {
    // 타입 추론이 가능하므로 제네릭 선언 생략 가능
    val generics = MyGenerics("a")

    val list1: MutableList<String> = mutableListOf()

    val list2 = mutableListOf<String>()

    val list3: List<*> = listOf("test")

    // PECS : producer-Extends, Consumer-Super
    // 공변성 : 자바 -> extends, 코틀린 -> out
    // 반공변성 : 자바 -> super, 코틀린 -> in

    val stringGenerics = MyGenerics("STRING")
    var charSequenceGenerics: MyGenerics<CharSequence> = stringGenerics

    val charSequenceGenerics2 = MyGenerics2<CharSequence>("a")
    var stringGenerics2: MyGenerics2<String> = charSequenceGenerics2
}