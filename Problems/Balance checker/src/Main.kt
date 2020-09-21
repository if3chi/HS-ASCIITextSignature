import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var balance = scanner.nextInt()
    val p = mutableListOf<Int>()

    while (scanner.hasNext()) {
        p.add(scanner.nextInt())
    }

    for (i in 0..p.size) {
        if (balance >= p[i]) {
            balance -= p[i]
            if (balance == 0 && i == p.lastIndex) {
                print("Thank you for choosing us to manage your account! " +
                        "You have 0 money.")
                break
            } else if (i == p.lastIndex && balance != 0) {
                print("Thank you for choosing us to manage your account! " +
                        "You have $balance money.")
                break
            }
        } else {
            print("Error, insufficient funds for the purchase. " +
                    "You have $balance, but you need ${p[i]}.")
            break
        }
    }
}