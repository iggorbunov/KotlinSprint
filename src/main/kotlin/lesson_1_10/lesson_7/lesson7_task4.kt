package org.example.lesson_1_10.lesson_7

fun main() {
    println("Введите количество секунд, которое хотите засечь")
    val seconds = readln().toInt()
    for (i in seconds downTo 0) {
        Thread.sleep(1000)
        println("Осталось $i секунд")
    }
    println("Время вышло!")
}