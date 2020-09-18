import java.util.*
import kotlin.math.pow

fun checkRoot(a: Int, b: Int, c: Int, d: Int, i: Double): Boolean = a * i.pow(3.0) +
        b * i.pow(2.0) + c * i + d == 0.toDouble()

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val (a, b, c, d) = IntArray(4) { scanner.nextInt() }

    for (x in (0..1000).map {it.toDouble()}) {
        if (checkRoot(a, b, c, d, x)) println(x.toInt())
    }
}