package org.example.lesson_9

fun main() {
    val ingredientQuantity = mutableListOf(2, 50, 15)
    val ingredientRecipe = listOf("Яиц", "Молока", "Сливочного масла")
    println("Введите количество блюд:")
    val dishQuantity = readln().toInt()
    val ingredientQuantityForDish = ingredientQuantity.map { it * dishQuantity }
    println("На $dishQuantity порций вам понадобится:")
    ingredientQuantityForDish.forEach {
        println("${ingredientRecipe[ingredientQuantityForDish.indexOf(it)]} - $it")
    }
}