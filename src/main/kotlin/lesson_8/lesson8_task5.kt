package org.example.lesson_8

fun main() {
    println("Введите количество ингредиентов:")
    val ingredientCount = readln().toInt()
    val recipeIngredient = arrayOfNulls<String>(ingredientCount)
    for (i in recipeIngredient.indices) {
        println("Введите название ${i + 1} ингридиента:")
        recipeIngredient[i] = readln()
    }
    for (i in recipeIngredient) {
        print(i)
        if (recipeIngredient.indexOf(i) < ingredientCount - 1) print(", ")
    }
}