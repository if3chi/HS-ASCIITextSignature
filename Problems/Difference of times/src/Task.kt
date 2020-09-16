import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

//    val h1 = scanner.nextInt()
//    val m1 = scanner.nextInt()
//    val s1 = scanner.nextInt()
//    val h2 = scanner.nextInt()
//    val m2 = scanner.nextInt()
//    val s2 = scanner.nextInt()

    val (h1, m1, s1) = IntArray(3) { scanner.nextInt() }
    val (h2, m2, s2) = IntArray(3) { scanner.nextInt() }

    println((h2 * 3600 + m2 * 60 + s2) - (h1 * 3600 + m1 * 60 + s1))

}
