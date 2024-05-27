package org.example.lesson_7

fun main() {
    var range: Int
    while (true) {
        println("Введите длину пароля:")
        range = readln().toInt()
        if (range >= 6) break
        else println("Длина пароля не может быть меньше 6")
    }

    val charset = ('A'..'Z') + ('0'..'9') + ('a'..'z')
    var password = ""
    for (i in 1..range) password += charset.random()
    println(password)
}