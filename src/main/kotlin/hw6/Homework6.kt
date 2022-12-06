package hw6

import java.util.*


fun main() {
//    hw6task1()
//    hw6task2()
//    hw6task3()
//    hw6task4()
    hw6task5()
}

fun hw6task1() {
    val maxElements = 10000

    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    println("Enter numbers separated by spaces")
    val array = "-?\\d+".toRegex().findAll(input)
        .map { it.value.toInt() }
        .toList()

    if (array.size > maxElements) {
        throw Exception("array cannot be more than $maxElements elements")
    }

    println(array.asSequence().sorted().joinToString(" "))
}

fun hw6task2() {
    val scanner = Scanner(System.`in`)
    val inputFirstArray = scanner.nextLine()
    val inputSecondArray = scanner.nextLine()

    val result = listOf(inputFirstArray, inputSecondArray)
    println(result.joinToString(""))
}


fun hw6task3() {
    val scanner = Scanner(System.`in`)
    val inputFirstArray = scanner.nextLine()
    val inputSecondArray = scanner.nextLine()

    println((inputFirstArray.toList() - inputSecondArray.toList()).joinToString(""))

}

fun hw6task4() {
    val scanner = Scanner(System.`in`)
    val inputFirstArray = scanner.nextLine()
    val inputSecondArray = scanner.nextLine()

    println((inputFirstArray.toList().intersect(inputSecondArray.toList()).joinToString("")))

}

fun hw6task5() {

    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    val inputArray = "-?\\d+".toRegex().findAll(input)
        .map { it.value.toInt() }
        .toList()

    if (inputArray.isEmpty()) {
        throw Exception("array must have at least 1 element")
    }

    val result = mutableListOf<Int>()

    result.add(inputArray.min())
    result.add(inputArray.average().toInt())
    result.add(inputArray.max())

    println(result.joinToString(" "))
}