package ru.otus.kotlin.hw12

import java.util.*


fun main() {

    val fileReader = FileReader()

    val scanner = Scanner(System.`in`)
    println("Введите название файла: ")
    val fileName = scanner.nextLine()

    fileReader.checkIfFileExist(fileName)

    println("Введите название операции: ")
    val operation = scanner.nextLine()

    fileReader.checkIfOperationIsAvailableForTheFile(fileName, Operation.valueOf(operation.uppercase()))

}

