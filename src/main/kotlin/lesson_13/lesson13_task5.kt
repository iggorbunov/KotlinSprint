package org.example.lesson_13

class Subscriber5(val name: String, val phoneNumber: Long, val company: String?) {

    fun outputUserInfo() {
        if (company.isNullOrEmpty()) {
            println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: <не указано>")
        } else println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
    }

}

fun main() {
    val phone = readln()
    try {
        phone.toLong()
    }
    catch (e:NumberFormatException){
        println("Ошибка NumberFormatException")
    }
}