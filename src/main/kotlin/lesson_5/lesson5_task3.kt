package org.example.lesson_5

const val WIN_NUMBER_1 = 12
const val WIN_NUMBER_2 = 22

fun main() {
    print("Введите первое число от 0 до 42: ")
    val userNumber1 = readln().toInt()
    print("Введите второе число от 0 до 42: ")
    val userNumber2 = readln().toInt()

    if (WIN_NUMBER_1 == userNumber1 && WIN_NUMBER_2 == userNumber2 || WIN_NUMBER_1 == userNumber2 && WIN_NUMBER_2 == userNumber1)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (WIN_NUMBER_1 == userNumber1 || WIN_NUMBER_2 == userNumber2 || WIN_NUMBER_1 == userNumber2 || WIN_NUMBER_2 == userNumber1)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")

    println("Выигрышные числа: $WIN_NUMBER_1 и $WIN_NUMBER_2")
}