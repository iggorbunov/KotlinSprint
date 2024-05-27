package org.example.lesson_7

fun main() {
    println("Введите число, до которого необходимо вывести четные числа:")
    val userRange = readln().toInt()
    for (i in 2..userRange step 2) println(i)
}