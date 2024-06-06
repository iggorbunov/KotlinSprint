package org.example.lesson_13

class Subscriber3(val name: String, val phoneNumber: Long, var company: String? = null) {

    fun outputUserInfo(name: String, phoneNumber: Long, company: String?) {
        if (company.isNullOrEmpty()) {
            println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: <не указано>")
        } else println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
    }
}

fun main() {
    val userList: MutableList<Subscriber3> = mutableListOf()
    val nameList = mutableListOf("Ilya", "Anna", "Ivan", "Dasha", "Kira")
    val phoneList = mutableListOf(81234567890, 80987654321, 81092834756, 89999999999, 81112223344)
    val companyList = mutableListOf("Apple", "null", null, null, "Google")
    for (i in 0..4) {
        userList.add(Subscriber3(nameList[i], phoneList[i], companyList[i]))
    }

    val companySet: MutableSet<String?> = mutableSetOf()
    for (i in 0..4) {
        companySet.add(userList[i].company)
    }
    println(companySet)
}