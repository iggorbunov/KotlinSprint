package org.example.lesson_1_10.lesson_10

fun main() {
    println("Введите длину пароля:")
    val passwordLength = readln().toInt()
    println(passwordGenerate(passwordLength))
}

fun passwordGenerate(length: Int): String {
    var password = ""
    val numberRange = '0'..'9'
    val symbolRange = ' '..'\''
    for (i in 1..length)
        when (i % 2 == 0) {
            true -> password += numberRange.random()
            false -> password += symbolRange.random()
        }
    return password
}