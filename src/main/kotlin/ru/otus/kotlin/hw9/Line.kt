package ru.otus.kotlin.hw9

import kotlin.math.*

open class Line(var p1: Point, var p2: Point) {

    constructor(aX: Double, aY: Double, bX: Double, bY: Double) : this(Point(aX, aY), Point(bX, bY))
    constructor(line: Line) : this(line.p1, line.p2)

    fun angle(): Double {
        return Math.toDegrees(
            atan((p2.getY() - p1.getY()) / (p2.getX() - p1.getX()))
        )
    }

    fun len(): Double {
        return sqrt((p1.getX() - p2.getX()).pow(2.0) + (p1.getY() - p2.getY()).pow(2))
    }

    fun rotate(degrees: Double): Line {
        val x2 = (p2.getX() * cos(degrees) - p2.getY() * sin(degrees))
        val y2 = (p2.getY() * cos(degrees) + p2.getX() * sin(degrees))
        return Line(p1.getX(), p1.getY(), x2, y2)
    }

    fun rotate90(dir: Int): Line {
        val degrees = when {
            dir < 0 -> 90.0
            else -> -90.0
        }
        val x2 = (p2.getX() * cos(degrees) - p2.getY() * sin(degrees))
        val y2 = (p2.getY() * cos(degrees) + p2.getX() * sin(degrees))
        return Line(p1.getX(), p1.getY(), x2, y2)
    }

    open fun isOnLine(p: Point): Boolean {
        val pX = p.getX()
        val pY = p.getY()
        return isOnLine(pX, pY)
    }

    open fun isOnLine(pX: Double, pY: Double): Boolean {
        return (pX - p1.getX()) * (p2.getY() - p1.getY()) - (p2.getX() - p1.getX()) * (pY - p1.getY()) == 0.0
    }

    override fun toString(): String {
        return "Line(a=$p1, b=$p2)"
    }

    fun getFirstPoint(): Point {
        return p1
    }

    fun getSecondPoint(): Point {
        return p2
    }
}