package org.example.lesson_7

fun main() {
    val range = 1..6
    val charset = ('0'..'9') + ('a'..'z')
    var password = ""
    for (i in range) password += charset.random()
    println(password)
}