package ru.otus.kotlin.hw7.task2.payment

import ru.otus.kotlin.hw7.task2.enum.Currency


class CashPayment(val total: Int, val change: Int, amount: Int, currency: Currency) : Payment(amount, currency) {

    override fun performPayment() {
    }
}