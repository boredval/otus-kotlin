package ru.otus.kotlin.hw7.task2.order


import ru.otus.kotlin.hw7.task2.Customer
import ru.otus.kotlin.hw7.task2.enum.OrderStatus
import ru.otus.kotlin.hw7.task2.payment.Payment
import java.sql.Date
import java.time.LocalDate

class Order(val customer: Customer, val details: OrderDetails, var payment: Payment?) {

    val date: Date = Date.valueOf(LocalDate.now())

    var status: OrderStatus = OrderStatus.WAITING_FOR_PAYMENT

    fun calcPrice(): Int {
        return 0
    }

    fun calcWeight(): Int {
        return 0
    }

    fun pay(payment: Payment) {
    }
}