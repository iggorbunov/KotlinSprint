package org.example.lesson_4

fun main() {
    val currentTrainingDay = 4
    val isEvenDay = currentTrainingDay % 2 == 0


    println("""
        Упражнения для рук:    ${!isEvenDay}
        Упражнения для ног:    ${isEvenDay}
        Упражнения для спины:  ${isEvenDay}
        Упражнения для пресса: ${!isEvenDay}
    """.trimIndent())
}