package org.example.lesson_6

fun main() {
    println("Ввведите количество секунд, которое хотите засечь на таймере:")
    var timerCount = readln().toInt()
    val secondsCount = timerCount
    while (timerCount > 0) {
        Thread.sleep(1000)
        timerCount--
    }
    println("Прошло $secondsCount секунд")
}