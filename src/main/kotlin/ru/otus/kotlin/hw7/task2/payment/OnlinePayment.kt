package ru.otus.kotlin.hw7.task2.payment


import ru.otus.kotlin.hw7.task2.enum.Currency
import ru.otus.kotlin.hw7.task2.enum.PaymentStatus


class OnlinePayment(val bankId: String, val bankName: String, amount: Int, currency: Currency) :
    Payment(amount, currency) {

    fun checkIfSucceed(): PaymentStatus {
        return PaymentStatus.PROCESSING
    }

    override fun performPayment() {
    }
}