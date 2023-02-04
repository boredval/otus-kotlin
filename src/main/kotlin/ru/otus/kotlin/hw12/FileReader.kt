package ru.otus.kotlin.hw12

import java.io.File

class FileReader {

    companion object {

        private const val FILE_PATH = "hw_12_docs/files.txt"

        private val filesWithOperationsMap = mutableMapOf<String, List<Operation>>()

    }

    init {
        fillFileNamesWithOperationsToMap()
    }

    fun checkIfFileExist(fileName: String): Boolean {
        return filesWithOperationsMap.contains(fileName).also {
            if (!it) println("Файл с таким названием не найден.")
        }
    }

    fun checkIfOperationIsAvailableForTheFile(fileName: String, operation: Operation) {
        if (filesWithOperationsMap.getValue(fileName).contains(operation)) {
            println("Для файла $fileName операция $operation доступна")
        } else {
            println("У пользователя нет доступа для совершения операции $operation")
        }
    }

    private fun fillFileNamesWithOperationsToMap() {
        File(FILE_PATH).forEachLine {
            if (it.contains(" - ")) {
                val substrings = it.split(" - ")
                val filename = substrings[0]
                val permissions = substrings[1].split(",").map { permission -> Operation.valueOf(permission) }

                filesWithOperationsMap[filename] = permissions
            } else {
                filesWithOperationsMap[it] = emptyList()
            }
        }
    }
}