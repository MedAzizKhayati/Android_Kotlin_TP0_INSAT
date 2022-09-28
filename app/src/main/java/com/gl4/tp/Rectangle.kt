package com.gl4.tp

import kotlin.math.abs

class Rectangle(var p: Point = Point(0, 0), var q: Point = Point(1, 1)) {
    override fun toString(): String {
        return "p=$p q=$q"
    }
    fun area(): Int {
        return abs(p.x - q.x) * abs(p.y - q.y)
    }
}


fun main() {
    val rectangles = listOf(
        Rectangle(),
        Rectangle(Point(1, 1)),
        Rectangle(q = Point(5, 5)),
        Rectangle(Point(1, 5), Point(5, 6)),
        Rectangle(q = Point(5, 5), p = Point(4, 8))
    )
    for (rec in rectangles)
        println("Rec: $rec, Area: ${rec.area()}")
}