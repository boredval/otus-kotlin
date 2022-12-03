package hw8.employee

import hw8.unit.Department


data class Employee(var position: String, override var name: String, override var surname: String) : Man() {

    lateinit var department: Department
    lateinit var idCard: IdCard
    private val roomSet: MutableSet<Room> = mutableSetOf()
    private val pastPositionSet: MutableSet<PastPosition> = mutableSetOf()

    fun deletePastPosition(pastPosition: PastPosition) {
        pastPositionSet.remove(pastPosition)
    }

    fun deleteRoom(room: Room) {
        roomSet.remove(room)
    }
}