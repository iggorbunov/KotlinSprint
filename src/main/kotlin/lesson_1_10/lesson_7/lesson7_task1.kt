package org.example.lesson_1_10.lesson_7

fun main() {
    val range = 1..6
    var password = ""
    for (i in range) {
        password += if (i % 2 == 0) ('0'..'9').random()
        else ('a'..'z').random()
    }
    println(password)
}