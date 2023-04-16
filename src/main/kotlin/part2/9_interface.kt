package part2

class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Cart : Wheel {
    var coin: Int

    val weight: String
        get() = "20KG"

    fun add(product: Product) {
        if (coin <= 0) {
            println("코인을 넣어주세요")
        } else {
            println("${product.name}이(가) 카트에 추가되었습니다.")
        }
    }

    fun rent() {
        if (coin <= 0) {
            println("코인을 넣어주세요")
        } else {
            println("카트를 대여합니다.")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다.")
    }
}

interface Order {
    fun add(product: Product) {
        println("${product.name} 주문이 완료되었습니다.")
    }
}

class MyCart(override var coin: Int) : Cart, Order {
    // 복수의 interface에서 중복된 메소드가 구현된 경우에는 상속받는 클래스에서 override로 구현해야한다
    override fun add(product: Product) {
        // super 뒤에 <>로 사용할 interface를 명시해줘야한다.
        super<Cart>.add(product)
        super<Order>.add(product)
    }
}

fun main() {
    val cart = MyCart(coin = 0)
    cart.rent()
    cart.coin = 100
    cart.rent()
    cart.roll()
    cart.add(Product("새우깡", 1300))

}