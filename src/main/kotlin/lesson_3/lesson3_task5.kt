package org.example.lesson_3

fun main() {
    val move = "D2-D4;0"
    val regexForSplit = "[-;]".toRegex()
    val splitMove = move.split(regexForSplit)

    println("""
        ${splitMove[0]}
        ${splitMove[1]}
        ${splitMove[2]}
    """.trimIndent())
}