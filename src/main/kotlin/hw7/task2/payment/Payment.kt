package ru.otus.hw_7.task_2.payment

import hw7.task2.enum.Currency
import hw7.task2.enum.PaymentStatus

open class Payment(val amount: Int, val currency: Currency) {

    val status: PaymentStatus = PaymentStatus.NOT_PAID

    open fun performPayment() {
    }
}