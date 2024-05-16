package org.example.lesson_2
import kotlin.math.pow

fun main() {
    val initialContribution = 70000
    val interestRate = 0.167
    val yearCount = 20

    val finalContribution: Double = initialContribution * (1 + interestRate).pow(yearCount)

    println("%.3f".format(finalContribution))
}