package ru.otus.kotlin.hw12

import java.util.*

fun main() {
    val translator = Translator()

    val scanner = Scanner(System.`in`)
    println("Введите слово для перевода: ")
    val word = scanner.nextLine()

    val translations = translator.getTranslation(word)

    if (translations.isEmpty()) println("В словаре нет перевода ")
    else println(translations.joinToString(", "))
}



