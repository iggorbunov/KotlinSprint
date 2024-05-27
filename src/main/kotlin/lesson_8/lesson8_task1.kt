package org.example.lesson_8

import kotlin.random.Random

fun main() {
    val views = IntArray(7, { Random.nextInt(1000, 10000) }) //{ Random.nextInt(1000, 10000) }
    var sumViews = 0
    for (i in views) sumViews += i
    println("Суммарное количество просмотров: $sumViews")
}