package org.example.lesson_6

const val HIDDEN_NUMBER = 9

fun main() {
    println("Вам нужно угадать число от 1 до 9")
    var attemptCount = 1
    var userNumber = 10
    while (attemptCount <= 5) {
        println("У вас $attemptCount попытка \nВведите число:")
        userNumber = readln().toInt()
        if (HIDDEN_NUMBER == userNumber) {
            println("Это была великолепная игра!")
            break
        }
        else println("Неверно!")
        attemptCount++
    }
    println("Было загаданно число $HIDDEN_NUMBER")
}