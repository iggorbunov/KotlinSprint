package org.example.lesson_1_10.lesson_5

import kotlin.random.Random

fun main() {
    val winNumber = List(3) { Random.nextInt(0, 42) }

    println("Введите 3 числа от 0 до 42\nПосле каждого числа нажать Enter")
    val userNumber: List<Int> = List(3) { readln().toInt() }
    val countWinNumber = userNumber.intersect(winNumber).size

    when (countWinNumber) {
        3 -> println("Вы угадали 3 числа - ДЖЕКПОТ!")
        2 -> println("Вы угадали 2 числа - крупный приз!")
        1 -> println("Вы угадалт 1 число - утешительный приз!")
        else -> println("Вы не угадали ни одного числа(")
    }

    println("Выигрышные числа: ${winNumber[0]}, ${winNumber[1]}, ${winNumber[2]}")
}