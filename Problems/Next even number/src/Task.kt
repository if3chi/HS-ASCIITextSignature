import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    
    var num = scanner.nextInt() + 1
    
    while (true) {
        if (num % 2 == 0) {
            print(num)
            break
        }
        num++
    }
}
