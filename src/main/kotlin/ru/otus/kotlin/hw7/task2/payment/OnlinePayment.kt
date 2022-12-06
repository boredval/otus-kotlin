package ru.otus.hw_7.task_2.payment

import hw7.task2.enum.Currency
import hw7.task2.enum.PaymentStatus


class OnlinePayment(val bankId: String, val bankName: String, amount: Int, currency: Currency) :
    Payment(amount, currency) {

    fun checkIfSucceed(): PaymentStatus {
        return PaymentStatus.PROCESSING
    }

    override fun performPayment() {
    }
}