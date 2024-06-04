package org.example.lesson_12

class Weather {
    var dayTemperature = 21
    var nightTemperature = 12
    var precipitation = false

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
    val day1 = Weather()
    val day2 = Weather()
    day1.outputWeather()
    day2.outputWeather()

    day1.dayTemperature = 12
    day1.nightTemperature = 0
    day1.precipitation = true

    day2.dayTemperature = 34
    day2.nightTemperature = 28
    day2.precipitation = false

    day1.outputWeather()
    day2.outputWeather()
}