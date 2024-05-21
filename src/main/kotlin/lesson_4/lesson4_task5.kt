package org.example.lesson_4

const val DAMAGE = false
const val FROM_CREW = 55
const val TO_CREW = 70
const val MIN_BOXES_PROVISIONS = 50
const val GOOD_WEATHER = true

fun main() {
    print("Есть повреждения корабля: ")
    val damage = readLine().toBoolean()

    print("Число экипажа: ")
    val crew = readLine()!!.toInt()

    print("Количество ящиков с провизией: ")
    val boxesProvisions = readLine()!!.toInt()

    print("Благоприятная ли погода: ")
    val weather = readLine().toBoolean()

    val departureShip = (DAMAGE == damage && (FROM_CREW <= crew && crew <= TO_CREW) && MIN_BOXES_PROVISIONS < boxesProvisions)
            || (TO_CREW == crew && GOOD_WEATHER == weather && MIN_BOXES_PROVISIONS <= boxesProvisions)

    println("Корабль может выходить в плавание: $departureShip")
}