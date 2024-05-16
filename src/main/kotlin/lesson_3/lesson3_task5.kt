package org.example.lesson_3

fun main() {
    val move = "D2-D4;0"
    val beginMove = move.substringBefore('-')
    val endMove = move.substringAfter('-').substringBefore(';')
    val moveNumber = move.substringAfter(';')

    println("""
        $beginMove
        $endMove
        $moveNumber
    """.trimIndent())
}