package org.example.lesson_1_10.lesson_10

import kotlin.random.Random

fun main() {
    val resultUser = diceThrow()
    val resultComputer = diceThrow()
    println("Ход игрока: $resultUser\nХод компьютера: $resultComputer")
    if (resultUser > resultComputer) println("Победило человечество")
    else if (resultUser < resultComputer) println("Победила машина")
    else println("Ничья")
}


fun diceThrow(): Int {
    return Random.nextInt(1, 6)
}