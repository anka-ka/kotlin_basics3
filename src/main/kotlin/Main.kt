import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    println("Введите сумму вашей покупки")
    val amount = scan.nextLine().toInt()
    var discount = 0
    if (amount in 1001..10000) discount = 100; if (amount > 10001) discount = (amount * 5) / 100
    var regularCustomer = false
    println("Являетесь ли вы постоянным покупателем? Ответьте да или нет")
    val input = scan.nextLine()
    var totalDiscount = discount
    if (input.equals("да")) {
        regularCustomer = true
    }
    if (regularCustomer == true) {
        totalDiscount = discount + (amount * 1) / 100
    }
    println("Ваша скидка составит $totalDiscount рублей")

}