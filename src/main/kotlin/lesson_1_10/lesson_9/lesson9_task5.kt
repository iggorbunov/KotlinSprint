package org.example.lesson_1_10.lesson_9

fun main() {
    var recipeList = mutableListOf<String>()
    println("Введите 5 ингредиентов")
    for (i in 1..5) recipeList.add(readln())
    recipeList = recipeList.sorted().distinct().toMutableList()
    recipeList.forEach {
        when (recipeList.indexOf(it)) {
            0 -> print("${it.capitalize()}, ")
            recipeList.size - 1 -> print(it)
            else -> print("$it, ")
        }
    }
}
