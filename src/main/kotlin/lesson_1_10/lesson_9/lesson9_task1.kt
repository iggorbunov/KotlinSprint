package org.example.lesson_1_10.lesson_9

fun main() {
    val recipeIngredient = listOf(
        "Куриный бульон", "Паста том-ям", "Лимон", "Рыбный соус", "Лимонная трава", "Имбирь",
        "Креветки", "Шампиньоны", "Кокосовое молоко", "Кинза"
    )
    println("В рецепте есть следующие ингредиенты:")
    recipeIngredient.forEach { println(it) }
}