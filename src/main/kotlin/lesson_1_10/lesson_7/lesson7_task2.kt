package org.example.lesson_1_10.lesson_7

import kotlin.random.Random

fun main() {
    var code = Random.nextInt(1000, 9999)
    var userCode: Int
    while (true) {
        println("Ваш код авторизации: $code\nВведите код для авторизации")
        userCode = readln().toInt()
        if (code == userCode) {
            println("Добро пожаловать!")
            return
        }
        code = Random.nextInt(1000, 9999)
    }
}