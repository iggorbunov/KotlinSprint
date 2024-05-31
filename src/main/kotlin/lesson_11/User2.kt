package lesson_11

/*
- вывод информации о пользователе в консоль;
- считывание из консоли текста и запись в поле bio;
- изменение пароля — сначала запросить текущий пароль, и, если он введен верно, запросить новый.
Записать его в поле и сообщить, что пароль изменен;
*/


class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "---",
) {
    fun userInfoOutput() {
        println(
            """
        ID: ${id}
        Логин: ${login}
        Пароль: ${password}
        Почта: ${email}
        О себе: ${bio}
    """.trimIndent()
        )
    }

    fun bioInput() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentPassword = readln()
        if (password == currentPassword) {
            print("Введите новый пароль: ")
            password = readln()
        }
        else println("Неверно введен текущий пароль")
    }
}