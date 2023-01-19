package ru.otus.kotlin.hw11

class WhereNonEq(val column: String, val value: Any?) : Where() {
    override fun addOperand(operand: Where) {}

    override fun toString(): String {
        return when (value) {
            null -> "$column !is null"
            is String -> "$column != '$value'"
            else -> "$column != $value"
        }
    }
}