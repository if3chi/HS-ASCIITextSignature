import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here

    val cups = scanner.nextInt()
    val weekType = scanner.nextBoolean()

    print(cups in 15..25 && weekType || cups in 10..20 && !weekType)
}