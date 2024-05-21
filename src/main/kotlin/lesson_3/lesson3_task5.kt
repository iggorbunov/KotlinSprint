package org.example.lesson_3

fun main() {
    val move = "D2-D4;0"
    val splitMove = move.split("-", ";")

    println("""
        ${splitMove[0]}
        ${splitMove[1]}
        ${splitMove[2]}
    """.trimIndent())
}