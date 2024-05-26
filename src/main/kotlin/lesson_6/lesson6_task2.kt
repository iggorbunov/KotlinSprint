package org.example.lesson_6

fun main() {
    println("Ввведите количество секунд, которое хотите засечь на таймере:")
    val timerCount = readln().toLong()
    Thread.sleep(1000 * timerCount)
    println("Прошло $timerCount секунд")
}