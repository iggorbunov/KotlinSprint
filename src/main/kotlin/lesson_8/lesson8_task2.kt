package org.example.lesson_8

fun main() {
    val recipeIngredient = arrayOf("Куриный бульон", "Паста том-ям", "Лимон", "Рыбный соус", "Лимонная трава", "Имбирь",
        "Креветки", "Шампиньоны", "Кокосовое молоко", "Кинза")
    println("Введите название ингредиента, который хотите найти:")
    val userIngredient = readln()
    for (i in recipeIngredient) {
        if (i == userIngredient) {
            println("Ингредиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}