package hw7.task2

import ru.otus.hw_7.task_2.order.OrderItem

class Customer(var name: String, var address: String = "No address") {

    private val orders = mutableListOf<OrderItem>()

    fun calcPrice(): Int {
        return 0
    }

    fun calcWeight(): Int {
        return 0
    }

    fun addItem(item: OrderItem) {
        orders.add(item)
    }

    fun itemsList(): List<OrderItem> {
        return orders
    }
}