import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
//    val numN = scanner.nextInt()
//    var min = 1
//
//    for (n in 1..numN) {
//        val num = scanner.nextInt()
//        if (n == 1) {
//            min = num
//        }
//        if (num <= min) {
//            min = num
//        }
//    }

    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    print(arr.min())

//    println(min)
}