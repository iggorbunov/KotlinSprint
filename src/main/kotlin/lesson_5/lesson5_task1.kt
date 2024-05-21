package org.example.lesson_5

fun main() {
    print(
        """
        Докажите что вы не бот - решите пример
        2 + 2 = 
    """.trimIndent()
    )
    val answer = readLine()!!.toInt()

    if (answer == 4) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}