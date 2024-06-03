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
    if (validateCredential(userName, USERNAME) && validateCredential(password, PASSWORD))
        authToken = generateJWT()
    else authToken = "null"
    val cartForView = cart(authToken)
    if (!cartForView.isNullOrEmpty()) println("Корзина содержит\n$cartForView")
    else println("Пользователь не авторизован")
}

fun cart(token: String): String? {
    if (token != "null") return CART
    else return null
}

fun validateCredential(fromUser: String, fromDataBase: String): Boolean {
    return fromUser == fromDataBase
}

fun generateJWT(): String {
    var jwt = ""
    for (i in 1..32) jwt += CHARSET.random().toString()
    return jwt
}