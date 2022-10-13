import java.text.DecimalFormat
import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    sumOfDigitsInNumber();

    minutesToYearsAndMonths()

    calculateSquareOfRectangle()
}


fun sumOfDigitsInNumber() {

    val scanner = Scanner(System.`in`)

    println("Введите число")

    val input = scanner.nextInt()

    var temp = input

    val numbers = arrayListOf<Int>()

    while (temp > 0) {
        numbers.add(temp % 10)
        temp /= 10
    }

    val result = numbers.sum()

    println("сумма чисел в числе $input равна $result")
}

fun minutesToYearsAndMonths() {

    val scanner = Scanner(System.`in`)

    println("Введите число")

    val minutes = scanner.nextInt()

    val months = (minutes / 43800L)
    val years = months / 12
    val remainingMonths = months % 12

    println("$minutes минут равно $years годам и $remainingMonths месяцам")

}

fun calculateSquareOfRectangle() {

    val scanner = Scanner(System.`in`)

    println("Введите ширину")
    val width = scanner.nextDouble()

    println("Введите высоту")
    val height = scanner.nextDouble()

    val result: Double = sqrt(width.pow(2.0) + height.pow(2.0))

    val numberFormat = DecimalFormat("#.000")
    println(numberFormat.format(result))
}