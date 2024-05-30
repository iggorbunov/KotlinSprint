package org.example.lesson_1_10.lesson_10

fun main() {
    println("Введите длину пароля:")
    val passwordLength = readln().toInt()
    println(passwordGenerate(passwordLength))
}

fun passwordGenerate(length: Int): String {
    var password = ""
    for (i in 1..length)
        password += (if (i % 2 == 0) ('0'..'9').random()
        else (listOf('!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ' ', '\'').random()))
    return password
}