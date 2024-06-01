package lesson_11

data class Category(
    val categoryId: Int,
    val name: String,
    val icon: Int? = null,
    val recipes: List<Recipe>
)

data class Recipe(
    val recipeId: Int,
    val name: String,
    val icon: Int? = null,
    val categoryId: Int,
    val ingredients: List<Ingredient>
)

data class Ingredient(
    val ingredientId: Int,
    val name: String,
    val quantity: Int,
    val measurementUnit: String,
    val recipeId: Int
)