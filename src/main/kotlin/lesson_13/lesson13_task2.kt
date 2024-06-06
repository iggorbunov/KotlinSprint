package org.example.lesson_13

class Subscriber2(val name: String, val phoneNumber: Long, var company: String? = null) {

    fun outputUserInfo(name: String, phoneNumber: Long, company: String?) {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val user = Subscriber2("Ilya", 81234567890, "Reddit")
    user.outputUserInfo(user.name, user.phoneNumber, user.company)
}