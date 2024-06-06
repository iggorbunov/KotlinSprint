package org.example.lesson_12

class Weather2(val dayTemperature: Int, val nightTemperature: Int, val precipitation: Boolean) {

    fun outputWeather() {
        println(
            """
            Температура днем: $dayTemperature
            Температура ночью: $nightTemperature
            Наличие осадков: $precipitation
            
        """.trimIndent()
        )
    }
}

fun main() {
    val day = Weather2(22, 18, false)
    day.outputWeather()
}