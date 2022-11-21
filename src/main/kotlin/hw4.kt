import java.util.*

fun main() {
//    task1()
//    task2()
    task3()
}

fun task1() {
    val scanner = Scanner(System.`in`)

    var num = scanner.nextInt()
    var reversedInteger = 0
    var remainder: Int

    val originalInteger: Int = num

    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }

    if (originalInteger == reversedInteger)
        println("$originalInteger is a palindrome.")
    else
        println("$originalInteger is not a palindrome.")
}

fun task2() {
    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()

    var factorial: Long = 1
    for (i in 1..num) {
        factorial *= i.toLong()
    }

    println("Factorial of $num = $factorial")

}

fun task3() {
    val scanner = Scanner(System.`in`)

    val floor = scanner.nextInt()

    for (i in  1..floor) {
        println(" ".repeat(floor-i)+" *".repeat(i))
    }
}