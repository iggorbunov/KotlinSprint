package org.example.lesson_2

fun main() {
    val crystalsOre = 7
    val ironOre = 11

    val crystalOreFromBuff = crystalsOre * 0.2
    val ironOreFromBuff = ironOre * 0.2

    print(crystalOreFromBuff.toInt())
    println(" Кристалической руды")
    print(ironOreFromBuff.toInt())
    println(" Железной руды")
}