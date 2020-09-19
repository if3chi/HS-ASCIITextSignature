import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val m = scanner.nextInt()
//    var found = false
//
//    for (n in arr) {
//        if (n == m) {
//            found = true
//            break
//        }
//    }
//
//    print(if (found) "YES" else "NO")
    print(if (m in arr) "YES" else "NO")
}