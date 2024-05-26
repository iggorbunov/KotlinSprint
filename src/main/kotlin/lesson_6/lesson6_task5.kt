package org.example.lesson_6

import kotlin.random.Random

fun main() {
    var attemptCount = 1
    var userSum = 0
    var term1 = 0
    var term2 = 0
    println("Для авторизации, вам нужно доказать что вы не бот. Для этого, решите пример")
    while (attemptCount <= 3) {
        term1 = Random.nextInt(1, 9)
        term2 = Random.nextInt(1, 9)
        println("$term1 + $term2 =")
        userSum = readln().toInt()
        if (term1 + term2 == userSum) {
            println("Добро пожаловать!")
            break
        } else if (attemptCount == 3) println("Доступ запрещен!")
        else println("Неверно!")
        attemptCount++
    }
}