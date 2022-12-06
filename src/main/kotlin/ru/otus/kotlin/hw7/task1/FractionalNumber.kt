package ru.otus.kotlin.hw7.task1

import kotlin.math.abs

class FractionalNumber(private val isPositive: Boolean = true, numeratorInput: Long, denominatorInput: Long) {

    private val numerator: Long
    private val denominator: Long

    init {
        if (denominatorInput == 0L) {
            println("Can't divide by zero")
            throw RuntimeException()
        }
        numerator = kotlin.math.abs(numeratorInput)
        denominator = kotlin.math.abs(denominatorInput)
    }

    fun plus(fractionalNumber: FractionalNumber): FractionalNumber {
        return if (numerator == 0L) {
            fractionalNumber
        } else if (fractionalNumber.numerator == 0L) {
            this
        } else {
            val resultNumerator = sumNumerators(fractionalNumber)
            FractionalNumber(
                resultNumerator >= 0,
                abs(resultNumerator),
                resolveDenominator(fractionalNumber)
            )
        }
    }

    fun minus(fractionalNumber: FractionalNumber): FractionalNumber {
        return if (numerator == 0L) {
            fractionalNumber
        } else if (fractionalNumber.numerator == 0L) {
            this
        } else {
            val resultNumerator = diffNumerators(fractionalNumber)
            FractionalNumber(resultNumerator >= 0, abs(resultNumerator), resolveDenominator(fractionalNumber))
        }
    }

    private fun negateIfNotPositive(fractionalNumber: FractionalNumber): Int {
        return if (fractionalNumber.isPositive) {
            1
        } else {
            -1
        }
    }

    private fun diffNumerators(fractionalNumber: FractionalNumber): Long {
        return if (denominator != fractionalNumber.denominator) {
            (numerator * fractionalNumber.denominator) * negateIfNotPositive(this) - (fractionalNumber.numerator * denominator) * negateIfNotPositive(
                fractionalNumber
            )
        } else {
            numerator * negateIfNotPositive(this) - fractionalNumber.numerator * negateIfNotPositive(fractionalNumber)
        }
    }

    private fun sumNumerators(fractionalNumber: FractionalNumber): Long {
        return if (denominator != fractionalNumber.denominator) {
            (numerator * fractionalNumber.denominator) * negateIfNotPositive(this) + (fractionalNumber.numerator * denominator) * negateIfNotPositive(
                fractionalNumber
            )
        } else {
            numerator * negateIfNotPositive(this) + fractionalNumber.numerator * negateIfNotPositive(fractionalNumber)
        }
    }

    private fun resolveDenominator(fractionalNumber: FractionalNumber): Long {
        return if (denominator != fractionalNumber.denominator) {
            multiplyDenominators(fractionalNumber)
        } else {
            denominator
        }
    }

    private fun multiplyDenominators(fractionalNumber: FractionalNumber): Long {
        return kotlin.math.abs(fractionalNumber.denominator * denominator)
    }

}