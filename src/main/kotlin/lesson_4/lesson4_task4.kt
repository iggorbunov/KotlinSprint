package org.example.lesson_4

fun main() {
    val currentTrainingDay = 4
    val armAndAbdominal = currentTrainingDay % 2 != 0
    val legAndBack = currentTrainingDay % 2 == 0

    println("""
        Упражнения для рук:    $armAndAbdominal
        Упражнения для ног:    $legAndBack
        Упражнения для спины:  $legAndBack
        Упражнения для пресса: $armAndAbdominal
    """.trimIndent())
}