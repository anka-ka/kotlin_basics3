fun main() {
    println("Введите сумму вашей покупки")
    val percentOfRegularCustomer = 1.0f / 100.0f
    val percentForBigSum = 5.0f / 100.0f
    val amount = readln().toInt()
    var discount = 0.0f
    if (amount in 1001..10000) {
        discount = 100.0f
    } else if (amount > 10001) {
        discount = amount * percentForBigSum
    }
    var regularCustomer = false
    println("Являетесь ли вы постоянным покупателем? Ответьте да или нет")
    val input = readln()
    var totalDiscount = discount
    if (input.equals("да")) {
        regularCustomer = true
    }
    if (regularCustomer == true) {
        totalDiscount += ((amount - discount) * percentOfRegularCustomer)
    } else {
        totalDiscount = discount
    }
    println("Ваша скидка составит ${totalDiscount.toInt()} рублей")

}