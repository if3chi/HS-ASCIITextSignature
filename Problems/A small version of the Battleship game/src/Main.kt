import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here

    val coor = mutableListOf<Int>()

    while (input.hasNext()) coor.add(input.nextInt())

    print(coor)
}