package org.example.lesson_2

fun main() {
    val crystalsOre = 7
    val ironOre = 11
    var buffPercent = 20

    val crystalOreFromBuff = crystalsOre * buffPercent / 100
    val ironOreFromBuff = ironOre * buffPercent / 100

    print("""
        ${crystalOreFromBuff.toInt()} Кристалической руды
        ${ironOreFromBuff.toInt()} Железной руды
        """.trimIndent())
}