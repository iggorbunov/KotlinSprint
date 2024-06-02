package org.example.lesson_1_10.lesson_9

fun main() {
    var recipeList = mutableSetOf<String>()
    println("Введите 5 ингредиентов")
    for (i in 1..5) recipeList.add(readln())
    recipeList = recipeList.sorted().toMutableSet()
    val outputRecipeList = recipeList.map { it.lowercase().replaceFirstChar(Char::uppercase) }.joinToString(", ")
    println(outputRecipeList)
}
