package ru.otus.kotlin.hw5

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

//    task1()
//    task2()
    task3()
}

fun task1() {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextLine()

    val inputArray = input.map { it.toString().toInt() }

    println(inputArray.min())
}

fun task2() {
    val scanner = Scanner(System.`in`)

    val inputX = scanner.nextLine()
    val inputY = scanner.nextLine()

    val minInputValue = -10000
    val maxInputValue = 10000
    val minAmountOfElements = 2
    val maxAmountOfElements = 2

    val x = inputX.map { it.toString().toInt() }
    val y = inputY.map { it.toString().toInt() }

    if ((x.size < minAmountOfElements || x.size > maxAmountOfElements) && (y.size < minAmountOfElements || y.size > maxAmountOfElements)) {
        println("input is less than $minAmountOfElements or more than $maxAmountOfElements, enter a valid value")
    }

    x.forEach {
        if (it !in minInputValue + 1 until maxInputValue) {
            println("input must be in range from $minInputValue to $maxInputValue")
        }
    }

    println(
        sqrt((x[1] - x[0]).toDouble().pow(2) + (y[1] - y[0]).toDouble().pow(2))
    )
}

fun task3() {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextLine()


    if (input.isNotBlank()) {

        PasswordValidation.values().filter { !it.validateInput(input) }.toList().forEach { println(it.message) }

    }

}