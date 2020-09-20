import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here

    val cups = scanner.nextInt()
    val weekType = scanner.nextBoolean()

    if (weekType) {
        print(cups in 15..25)
    } else {
        print(cups in 10..20)
    }
}