package org.example.lesson_1_10.lesson_9

fun main() {
    println("Введи 5 ингредиентов, через ', ' (запятая с пробелом)")
    val recipeIngredient = readln().split(", ")
    if (recipeIngredient.size == 5) {
        val sortRecipeIngredient = recipeIngredient.sorted()
        println(sortRecipeIngredient)
    } else println("Ингредиентов должно быть 5!")

}