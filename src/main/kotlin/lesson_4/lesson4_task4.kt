package org.example.lesson_4

fun main() {
    val currentTrainingDay = 4
    val isEvenDay = currentTrainingDay % 2
    val isArmAndAbdominalDay = isEvenDay != 0
    val isLegAndBackDay = isEvenDay == 0

    println("""
        Упражнения для рук:    $isArmAndAbdominalDay
        Упражнения для ног:    $isLegAndBackDay
        Упражнения для спины:  $isLegAndBackDay
        Упражнения для пресса: $isArmAndAbdominalDay
    """.trimIndent())
}