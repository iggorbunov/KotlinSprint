package org.example.lesson_6

fun main() {
    println("Ввведите количество секунд, которое хотите засечь на таймере:")
    var timerCount = readln().toInt()
    var secondsCount = 1
    while (timerCount > 0) {
        Thread.sleep(1000)
        println("Прошло $secondsCount секунд")
        secondsCount++
        timerCount--
    }
    println("Время вышло")
}