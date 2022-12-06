package ru.otus.hw_7.task_2.payment

import hw7.task2.enum.Currency

class CashPayment(val total: Int, val change: Int, amount: Int, currency: Currency) : Payment(amount, currency) {

    override fun performPayment() {
    }
}