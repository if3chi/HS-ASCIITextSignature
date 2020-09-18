import java.util.*
import kotlin.math.pow

fun checkRoot(a: Int, b: Int, c: Int, d: Int, i: Int): Boolean = a * i.toDouble().pow(3.0) +
        b * i.toDouble().pow(2.0) + c * i + d == 0.toDouble()

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val (a, b, c, d) = IntArray(4) { scanner.nextInt() }

    for (i in 0..1000) {
        if (checkRoot(a, b, c, d, i)) println(i)
    }
}