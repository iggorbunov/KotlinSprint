package org.example.lesson_6

fun main() {
    println("Ввведите количество секунд, которое хотите засечь на таймере:")
    var timerCount = readln().toInt()
    while (timerCount > 0) {
        println("Осталось секунд: ${timerCount--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}