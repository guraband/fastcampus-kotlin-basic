package part2

// enum도 class이기 때문에 interface 상속 가능
enum class PaymentStatus(val label: String) : Payable {
    UNPAID("결제 전") {
        override fun isPayable(): Boolean = true
    },
    PAID("결제완료") {
        override fun isPayable(): Boolean = false
    },
    FAILED("실패") {
        override fun isPayable(): Boolean = false
    },
    REFUND("환불") {
        override fun isPayable(): Boolean = false
    },
    ;

    fun print() {
        println("[$this] ${label}, 순서 : ${this.ordinal}, 지급 가능 여부 : ${isPayable()}")
    }
}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    for (e in PaymentStatus.values()) {
        e.print()
    }

    val paymentStatus = PaymentStatus.valueOf("PAID")
    paymentStatus.print()

    try {
        val paymentStatus2 = PaymentStatus.valueOf("PAID2")
        paymentStatus2.print()
    } catch (e: IllegalArgumentException) {
        println("(!) 존재하지 않는 enum")
    }
}