package org.example.lesson_9

fun main() {
    val basicRecipeIngredient = mutableListOf("яйцо", "соль", "перец")
    println("В рецепте есть базовые ингредиенты:")
    basicRecipeIngredient.forEach { println(it) }
    println("Желаете добавить еще?")
    val userAnswer = readln()
    if (userAnswer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        basicRecipeIngredient.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты:")
        basicRecipeIngredient.forEach { println(it) }
    }
}