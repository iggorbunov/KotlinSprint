package org.example.lesson_2

fun main() {
    val crystalsOre = 7
    val ironOre = 11
    var buffPercent = 0.2

    val crystalOreFromBuff = crystalsOre * buffPercent
    val ironOreFromBuff = ironOre * buffPercent

    print("""
        ${crystalOreFromBuff.toInt()} Кристалической руды
        ${ironOreFromBuff.toInt()} Железной руды
        """.trimIndent())
}