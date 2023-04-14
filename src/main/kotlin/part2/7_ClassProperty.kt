// 본문이 없는 클래스도 선언 가능
class EmptyClass

class Coffee(
    val name: String,
    val price: Int = 2_000,
    var iced: Boolean = false, // trailing comma
) {

    val brand: String
        get() {
            return "스타벅스"
        }

    var quantity: Int = 0
        // var는 custom setter 선언 각능
        set(value) {
            if (value > 0) {
                field = value
            }
        }
}


fun main() {
    val coffee = Coffee("아메리카노")
    println("${coffee.brand} ${coffee.name} 가격은 ${coffee.price}, 수량은 ${coffee.quantity}")

    coffee.iced = true

    if (coffee.iced) {
        println("아이스")
    } else {
        println("아이스 아님")
    }
}