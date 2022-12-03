package hw8.unit

import hw8.employee.Employee

class Department(var name: String) : Unit {
    override var personCount: Int = 0
    val employees: Set<Employee> = mutableSetOf()
}