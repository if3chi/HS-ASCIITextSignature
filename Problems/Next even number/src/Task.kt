import java.util.Scanner

fun main() {
    val num = Scanner(System.`in`).nextInt() + 1

    print(if (num % 2 == 0) num else num + 1)
    
//    while (true) {
//        if (num % 2 == 0) {
//            print(num)
//            break
//        }
//        num++
//    }
}
