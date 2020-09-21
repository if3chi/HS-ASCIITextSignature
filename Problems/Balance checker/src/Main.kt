import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var balance = scanner.nextInt()
    var enough = true
    var purchase = 0

    while (scanner.hasNext()) {
        purchase = scanner.nextInt()

        if (balance >= purchase) {
            balance -= purchase
        } else {
            enough = false
            break
        }
    }

    if (enough) {
        println("Thank you for choosing us to manage your account! You have $balance money.")
    } else {
        print("Error, insufficient funds for the purchase. You have $balance, but you need $purchase.")
    }
}