package org.example.lesson_13

class Subscriber4(val name: String, val phoneNumber: Long, val company: String?) {

    fun outputUserInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}\n")
    }

}

fun main() {
    val contactList: MutableList<Subscriber4> = mutableListOf()
    while (true) {
        println("Хотите добавить контакт?")
        if (readln() == "да") {
            contactList.add(addContact() ?: continue)
            continue
        }
        break
    }
    println("Все добавленные контакты:")
    contactList.forEach {
        it.outputUserInfo()
    }

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
    if (readLine().isNullOrEmpty()) null

    return Subscriber4(inputName, inputPhoneNumber, inputCompany)
}