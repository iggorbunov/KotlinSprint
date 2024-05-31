package org.example.lesson_1_10.lesson_10

fun main() {
    val resultUser = diceThrow()
    val resultComputer = diceThrow()
    println("Ход игрока: $resultUser\nХод компьютера: $resultComputer")
    if (resultUser == resultComputer) {
        println("Ничья")
    } else when (resultUser > resultComputer) {
        true -> println("Победило человечество")
        false -> println("Победила машина")
    }
}


fun diceThrow(): Int {
    return (1..6).random()
}