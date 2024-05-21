package org.example.lesson_5

const val AGE_OF_MOJORITY = 18
const val CURRENT_YEAR = 2024

fun main() {
    println("Введите ващ год рождения")
    val yearBirthday = readLine()!!.toInt()
    if (CURRENT_YEAR - yearBirthday >= AGE_OF_MOJORITY) println("Показать экран со скрытым контентом.")
    else println("Экран скрыт")
}