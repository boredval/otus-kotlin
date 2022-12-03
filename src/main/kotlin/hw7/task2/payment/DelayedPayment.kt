package ru.otus.hw_7.task_2.payment

import hw7.task2.enum.Currency
import java.util.*


class DelayedPayment(val endDate: Date, val partAmount: String, amount: Int, currency: Currency) :
    Payment(amount, currency) {

    fun performPartialPayment(amount: Int) {
    }

    override fun performPayment() {
    }
}