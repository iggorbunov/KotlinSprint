package org.example.lesson_1_10.lesson_4
const val TABLE_QUANTITY = 13

fun main() {
    var todayBusyTable = 13
    var tomorrowbusyTable = 9

    println("Доступность столиков на сегодня: ${TABLE_QUANTITY > todayBusyTable}\nДоступность столиков на завтра: ${TABLE_QUANTITY > tomorrowbusyTable}")
}