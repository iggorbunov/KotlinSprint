package org.example.lesson_5

const val TERM1 = 2
const val TERM2 = 2

fun main() {
    print(
        """
        Докажите что вы не бот - решите пример
        $TERM1 + $TERM2 = 
    """.trimIndent()
    )
    val answer = readln().toInt()

    if (answer == TERM1 + TERM2) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}