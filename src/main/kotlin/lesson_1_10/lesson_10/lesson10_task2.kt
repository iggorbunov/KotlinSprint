package org.example.lesson_1_10.lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    if (validation(login) >= 4 && validation(
            password
        ) >= 4) {
        println("Добро пожаловать!")
    } else println("Логин или пароль недостаточно длинные")
}

fun validation(text: String): Int {
    return text.length
}