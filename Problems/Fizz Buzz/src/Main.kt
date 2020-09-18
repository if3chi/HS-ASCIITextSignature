import java.util.*

fun usingIf(n: Int) {
    if (n % 3 == 0 && n % 5 == 0) {
            println("FizzBuzz")
        } else if (n % 3 == 0) {
            println("Fizz")
        } else if (n % 5 == 0) {
            println("Buzz")
        } else {
            println(n)
        }
}

fun usingWhen(n: Int) {
    println(when {
        n % 3 == 0 && n % 5 == 0 -> "FizzBuzz"
        n % 5 == 0 -> "Buzz"
        n % 3 == 0 -> "Fizz"
        else -> n
    })
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val (a, b) = IntArray(2) { scanner.nextInt() }

    for (n in a..b) {
        usingWhen(n)
//        usingIf(n)
    }
}