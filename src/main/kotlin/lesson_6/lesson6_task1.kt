package org.example.lesson_6

fun main() {
    println("Добро пожаловать! Для регистрации, введите логин:")
    val userName = readln()
    println("Введите пароль:")
    val password = readln()
    println("Вы зарегистрированы!\nДля авторизации введите свой логин:")
    var inputUserName = readln()
    println("Введите пароль:")
    var inputPassword = readln()
    while (userName != inputUserName && password != inputPassword) {
        println("Неправильный логин и пароль, попробуйте еще раз\nВведите логин:")
        inputUserName = readln()
        println("Введите пароль:")
        inputPassword = readln()
    }
    println("Вы успешно авторизовались!")
}