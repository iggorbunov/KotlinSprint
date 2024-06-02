package lesson_11

fun main() {
    val user1 = User(
        id = 1,
        login = "First_User",
        password = "qwerty123!",
        email = "first@email.ru"
    )
    val user2 = User(
        id = 2,
        login = "Second_User",
        password = "QWERTY123!",
        email = "second@email.ru"
    )
    outputUserClass(user1)
    outputUserClass(user2)
}

fun outputUserClass(user: User) {
    println("""
        ID: ${user.id}
        Логин: ${user.login}
        Пароль: ${user.password}
        Почта: ${user.email}
        
    """.trimIndent())
}