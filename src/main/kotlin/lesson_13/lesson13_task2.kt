package org.example.lesson_13

class Subscriber2(val name: String, val phoneNumber: Long, var company: String? = null) {

    fun outputUserInfo(name: String, phoneNumber: Long, company: String?) {
        if (company.isNullOrEmpty()) {
            println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: <не указано>")
        } else println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
    }
}

fun main() {
    val user = Subscriber2("Ilya", 81234567890, "Reddit")
    user.outputUserInfo(user.name, user.phoneNumber, user.company)
}