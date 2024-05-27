package org.example.lesson_8

fun main() {
    val recipeIngredient = arrayOf(
        "Куриный бульон", "Паста том-ям", "Лимон", "Рыбный соус", "Лимонная трава", "Имбирь",
        "Креветки", "Шампиньоны", "Кокосовое молоко", "Кинза"
    )
    for (i in recipeIngredient) println(i)
    println("Введите название ингредиента, который хотите заменить:")
    val userIngredient = readln()
    if (userIngredient in recipeIngredient) {
        println("Ингредиент $userIngredient в рецепте есть\nВведите ингредиент, который хотите добавить:")
        recipeIngredient[recipeIngredient.indexOf(userIngredient)] = readln()
        println("Готово! Вы сохранили следующий список:")
        for (i in recipeIngredient) println(i)
        return
    }
    println("Такого ингредиента в рецепте нет")
}