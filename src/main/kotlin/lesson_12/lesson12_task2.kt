package org.example.lesson_12

class Weather2(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    var dayTemperature = dayTemperature
    var nightTemperature = nightTemperature
    var precipitation = precipitation

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