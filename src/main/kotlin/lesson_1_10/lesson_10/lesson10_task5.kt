package org.example.lesson_1_10.lesson_10

val CHARSET = ('0'..'9') + ('a'..'z')

val CART = "Яйца, хлеб, соль"
const val USERNAME = "login"
const val PASSWORD = "password"

fun main() {
    println("Введите логин")
    val userName = readln()
    println("Введите пароль")
    val password = readln()
    var authToken = ""
    if (isValidationCredential(userName, USERNAME) == true && isValidationCredential(password, PASSWORD) == true)
        authToken = generatorJWT()
    else authToken = "null"
    val cartForView = cart(authToken)
    if (cartForView != "null") println("Корзина содержит\n$cartForView")
    else println("Пользователь не авторизован")
}

fun cart(token: String): String {
    if (token != "null") return CART
    else return "null"
}

fun isValidationCredential(fromUser: String, fromDataBase: String): Boolean {
    return fromUser == fromDataBase
}

fun generatorJWT(): String {
    var jwt = ""
    for (i in 1..32) jwt += CHARSET.random().toString()
    return jwt
}