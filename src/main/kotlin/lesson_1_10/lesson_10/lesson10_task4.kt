package org.example.lesson_1_10.lesson_10

import kotlin.random.Random

fun main() {
    var winCounter = 0
    while (true){
        winCounter += round()
        println("Хотите сыгрыть еще?")
        if (readln() == "да") continue
        else {
            println("Вы выиграли $winCounter раундов")
            return
        }
    }
}

fun diceThrow10_4(): Int = Random.nextInt(1, 6)

fun round(): Int {
    val resultUser = diceThrow10_4()
    val resultComputer = diceThrow10_4()
    println("Ход игрока: $resultUser\nХод компьютера: $resultComputer")
    if (resultUser > resultComputer) {
        println("Победило человечество")
        return 1
    }
    else if (resultUser < resultComputer) {
        println("Победила машина")
        return 0
    }
    else {
        println("Ничья")
        return 0
    }
}