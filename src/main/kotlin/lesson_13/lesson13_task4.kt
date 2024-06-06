package org.example.lesson_13

class Subscriber4(val name: String, val phoneNumber: Long, val company: String?) {

    fun outputUserInfo() {
        if (company.isNullOrEmpty()) {
            println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: <не указано>")
        } else println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
    }

}

fun main() {
    val user = addContact()
    user?.outputUserInfo()
}

fun addContact(): Subscriber4? {
    println("Введите имя")
    val inputName = readLine() ?: ""

    println("Введите номер телефона")
    val inputPhoneNumber = readLine()?.toLongOrNull()
    if (inputPhoneNumber == null) {
        println("Нельзя добавить контакт без номера телефона")
        return null
    }

    println("Введите компанию (оставьте поле пустым, если не хотите указывать компанию)")
    val inputCompany = readLine()

    return Subscriber4(inputName, inputPhoneNumber, inputCompany)
}