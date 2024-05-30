package org.example.lesson_8

import kotlin.random.Random

fun main() {
    val views = IntArray(7, { Random.nextInt(1000, 10000) })
    println("Суммарное количество просмотров: ${views.sum()}")
}