package org.example.lesson_1_10.lesson_2

fun main() {
    val hourDeparture: Int = 9
    val minuteDeparture: Int = 39
    val travelTime = 457

    val hourArrival = hourDeparture + (travelTime + minuteDeparture) / 60
    val minuteArrival = minuteDeparture + travelTime - (hourArrival - hourDeparture) * 60

    print(hourArrival)
    print(":")
    print(minuteArrival)
}