package ru.otus.kotlin.hw12

import java.io.File


class Translator {

    companion object {
        private const val FILE_PATH_TRANSLATIONS = "hw_12_docs/translations.txt"

        private val latinCharset = 'A'..'z'
    }

    private val dictionaryEnRu = HashMap<String, List<String>>()
    private val dictionaryRuEn = HashMap<String, MutableList<String>>()

    init {
        fillDictionaryEnRu()
        fillDictionaryRuEn()
    }

    fun getTranslation(word: String): List<String> {
        return if (word[0] in latinCharset) {
            dictionaryEnRu[word] ?: mutableListOf()
        } else {
            dictionaryRuEn[word] ?: listOf()
        }
    }

    private fun fillDictionaryEnRu() {
        File(FILE_PATH_TRANSLATIONS).forEachLine {
            val substrings = it.split(" - ")
            val wordEn = substrings[0]
            val wordsRu = substrings[1].split(",")

            dictionaryEnRu[wordEn] = wordsRu
        }
    }

    private fun fillDictionaryRuEn() {
        File(FILE_PATH_TRANSLATIONS).forEachLine {
            val substrings = it.split(" - ")
            val wordEn = substrings[0]
            val wordsRu = substrings[1].split(",")

            wordsRu.forEach { wordRu ->
                if (dictionaryRuEn.containsKey(wordRu)) {
                    if (!dictionaryRuEn[wordRu]!!.contains(wordEn)) dictionaryRuEn[wordRu]!!.add(wordEn)
                } else {
                    dictionaryRuEn[wordRu] = mutableListOf(wordEn)
                }
            }
        }
    }
}