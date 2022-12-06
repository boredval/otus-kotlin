package ru.otus.kotlin.hw7.task2.payment

import ru.otus.kotlin.hw7.task2.enum.Currency
import ru.otus.kotlin.hw7.task2.enum.PaymentStatus

open class Payment(val amount: Int, val currency: Currency) {

    val status: PaymentStatus = PaymentStatus.NOT_PAID

    open fun performPayment() {
    }
}