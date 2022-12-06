package ru.otus.kotlin.hw8.unit

import ru.otus.kotlin.hw8.employee.Employee


class Department(private var name: String) : Unit {

    override var personCount: Int = 0
    private val employees = mutableSetOf<Employee>()

    fun addEmployee(employee: Employee) {
        this.employees.add(employee)
    }

    fun removeEmployee(employee: Employee) {
        this.employees.remove(employee)
    }
}