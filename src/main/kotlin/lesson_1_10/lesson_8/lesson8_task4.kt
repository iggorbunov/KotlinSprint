package org.example.lesson_1_10.lesson_8

fun main() {
    val recipeIngredient = arrayOf(
        "Куриный бульон", "Паста том-ям", "Лимон", "Рыбный соус", "Лимонная трава", "Имбирь",
        "Креветки", "Шампиньоны", "Кокосовое молоко", "Кинза"
    )
    for (i in recipeIngredient) println(i)
    println("Введите название ингредиента, который хотите заменить:")
    val userIngredient = recipeIngredient.indexOf(readln())
    if (userIngredient > 0) {
        println("Ингредиент ${recipeIngredient[userIngredient]} в рецепте есть\nВведите ингредиент, который хотите добавить:")
        recipeIngredient[userIngredient] = readln()
        println("Готово! Вы сохранили следующий список:")
        for (i in recipeIngredient) println(i)
        return
    }
    println("Такого ингредиента в рецепте нет")
}