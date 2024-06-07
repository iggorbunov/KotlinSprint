package org.example.lesson_13

class Subscriber5(val name: String, val phoneNumber: Long, val company: String?) {

    fun outputUserInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }

}

fun main() {
    val phone = readln()
    try {
        phone.toLong()
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
    }
}