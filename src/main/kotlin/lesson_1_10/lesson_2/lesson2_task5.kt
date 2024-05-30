package org.example.lesson_1_10.lesson_2
import kotlin.math.pow

fun main() {
    val initialContribution = 70000
    var interestRate = 16.7
    interestRate = interestRate / 100 // Не понимаю как лучше сделать, что бы не было магических чисел, но и не заводить const для 100
    val yearCount = 20

    val finalContribution: Double = initialContribution * ((1 + (interestRate))).pow(yearCount)

    println("%.3f".format(finalContribution))
}