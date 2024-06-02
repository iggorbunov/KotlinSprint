package org.example.lesson_1_10.lesson_10

const val PASSWORD_LENGTH = 4

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    when (validation(login) && validation(password)) {
        true -> print("Добро пожаловать!")
        false -> print("Логин или пароль недостаточно длинные")
    }
}

fun validation(text: String): Boolean {
    return (text.length >= PASSWORD_LENGTH)
}