import java.util.*
import kotlin.system.exitProcess

fun main() {

}

fun hw3Task1() {
    var daysInYears = 365
    val scanner = Scanner(System.`in`)
    val month = scanner.nextInt()
    val day = scanner.nextInt()

    var result = 0

    if (month in 1..12 && day in 1..31) {
        for (i in 1 until (month)) {
            val nDays = when (i) {
                1, 3, 5, 6, 8, 10, 12 -> 31
                2 -> 28
                else -> 30
            }
            result += nDays
        }
        result += day

    } else {
        println("incorrect input value")
        exitProcess(1)
    }



    println(daysInYears - result)
}

fun hw3Task2() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()

    val ones = when (input % 10) {
        0 -> ""
        1 -> "I"
        2 -> "II"
        3 -> "III"
        4 -> "IV"
        5 -> "V"
        6 -> "VI"
        7 -> "VII"
        8 -> "VIII"
        9 -> "IX"
        else -> {
            println("incorrect input value")
            exitProcess(1)
        }
    }

    val tenth = when (input / 10) {
        1 -> "X"
        2 -> "XX"
        3 -> "XXX"
        4 -> "XL"
        5 -> "L"
        6 -> "LX"
        7 -> "LXX"
        8 -> "LXXX"
        9 -> "XC"
        else -> {
            println("incorrect input value")
            exitProcess(1)
        }

    }

    println("$tenth$ones")

}

fun hw3Task3() {

    val scanner = Scanner(System.`in`)
    val firstInput = scanner.nextInt()
    val secondInput = scanner.nextInt()
    val thirdInput = scanner.nextInt()

    if (firstInput + secondInput < thirdInput || firstInput > secondInput + thirdInput || firstInput + thirdInput < secondInput) {
        println("incorrect input value")

        exitProcess(1)
    }


    if ((firstInput >= secondInput && firstInput > thirdInput) || (firstInput > secondInput && firstInput >= thirdInput)) {

        if (firstInput * firstInput == secondInput * secondInput + thirdInput * thirdInput) {
            println("прямоуголный")
        } else if (firstInput * firstInput >= secondInput * secondInput + thirdInput * thirdInput) {
            println("тупоуголный")
        } else if (firstInput * firstInput < secondInput * secondInput + thirdInput * thirdInput) {
            println("остроуголный")
        }
    }

    if ((secondInput >= firstInput && secondInput > thirdInput) || (secondInput > firstInput && secondInput >= thirdInput)) {

        if (secondInput * secondInput == firstInput * firstInput + thirdInput * thirdInput) {
            println("прямоуголный")
        } else if (secondInput * secondInput >= firstInput * firstInput + thirdInput * thirdInput) {
            println("тупоуголный")
        } else if (secondInput * secondInput < firstInput * firstInput + thirdInput * thirdInput) {
            println("остроуголный")
        }
    }

    if ((thirdInput >= firstInput && thirdInput > secondInput) || (thirdInput > firstInput && thirdInput >= secondInput)) {

        if (thirdInput * thirdInput == secondInput * secondInput + firstInput * firstInput) {
            println("прямоуголный")
        } else if (thirdInput * thirdInput >= secondInput * secondInput + firstInput * firstInput) {
            println("тупоуголный")
        } else if (thirdInput * thirdInput < secondInput * secondInput + firstInput * firstInput) {
            println("остроуголный")
        }
    }

}