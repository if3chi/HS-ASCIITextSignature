import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val range  = scanner.nextInt()
    val numbers = IntArray(range) { scanner.nextInt() }

    print(numbers.max()?.let { numbers.indexOf(it) })
}