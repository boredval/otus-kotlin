package ru.otus.kotlin.hw12

import java.io.File
import java.util.*

const val FILE_PATH = "hw_12_docs/files.txt"

val filesWithOperationsMap = mutableMapOf<String, List<String>>()

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите название файла: ")
    val fileName = scanner.nextLine()

    deserializeToMap()

    if (!filesWithOperationsMap.contains(fileName)) {
        println("Файл с таким названием не найден.")
        return
    }

    println("Введите название операции: ")
    val operation = scanner.nextLine()

    if (filesWithOperationsMap.getValue(fileName)
            .contains(operation.uppercase())
    ) println("Для файла $fileName операция $operation доступна")
    else println("У пользователя нет доступа для совершения операции $operation")

}

fun deserializeToMap(): MutableMap<String, List<String>> {
    File(FILE_PATH).forEachLine {
        if (it.contains(" - ")) {
            val substrings = it.split(" - ")
            val filename = substrings[0]
            val permissions = substrings[1].split(",")

            filesWithOperationsMap[filename] = permissions
        } else {
            filesWithOperationsMap[it] = emptyList()
        }
    }

    return filesWithOperationsMap
}