package ru.otus.hw_7.task_2.order

class OrderDetails(val items: List<OrderItem>) {

    var location: String = ""

    fun calcPrice(): Int {
        return 0
    }

    fun calcWeight(): Int {
        return 0
    }

    fun addItem(item: OrderItem): Int {
        return 0
    }
}