package lesson_11

fun main() {
    val currentUser = User2(
        id = 1,
        login = "First_User",
        password = "qwerty123!",
        email = "first@email.ru"
    )
    currentUser.bioInput()
    currentUser.changePassword()
    currentUser.userInfoOutput()
}