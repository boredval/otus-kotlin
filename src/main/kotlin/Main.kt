import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    sumOfDigitsInNumber(825);

    minutesToYearsAndMonths(38578378)

    calculateSquareOfRectangle(10.0, 3.0);
}


fun sumOfDigitsInNumber(number: Int) {

    var temp = number;

    val numbers = arrayListOf<Int>()

    while (temp > 0) {
        numbers.add(temp % 10)
        temp /= 10
    }

    val result = numbers.sum()

    println("сумма чисел в числе $number равна $result")
}

fun minutesToYearsAndMonths(minutes: Long) {

    val months = (minutes / 43800L);
    val years = months / 12
    val remainingMonths = months % 12

    println("$minutes минут равно $years годам и $remainingMonths месяцам")

}

fun calculateSquareOfRectangle(width: Double , height: Double) {

    val result: Double = sqrt(width.pow(2.0) + height.pow(2.0))

    val numberFormat = DecimalFormat("#.000")
    println(numberFormat.format(result))
}