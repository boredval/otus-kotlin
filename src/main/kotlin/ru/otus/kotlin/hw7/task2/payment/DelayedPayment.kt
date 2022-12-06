package ru.otus.kotlin.hw7.task2.payment

import java.util.*


class DelayedPayment(val endDate: Date, val partAmount: String, amount: Int, currency: Currency) :
    Payment(amount, currency) {

    fun performPartialPayment(amount: Int) {
    }

    override fun performPayment() {
    }
}