package org.example.lesson_1_10.lesson_10

fun main() {
    val resultUser = diceThrow()
    val resultComputer = diceThrow()
    println("Ход игрока: $resultUser\nХод компьютера: $resultComputer")
    when {
        (resultUser > resultComputer) -> println("Победило человечество")
        (resultUser < resultComputer) -> println("Победила машина")
        (resultUser == resultComputer) -> println("Ничья")
    }
}

fun diceThrow(): Int {
    return (1..6).random()
}