package org.example.lesson_12

class Weather3 {
    var dayTemperature = 0
    var nightTemperature = 0
    var precipitation = false

    fun outputWeather() {
        println(
            """
            Температура днем: ${dayTemperature - 273}
            Температура ночью: ${nightTemperature - 273}
            Наличие осадков: $precipitation
            
        """.trimIndent()
        )
    }
}

fun main() {
    val day = Weather3()
    day.dayTemperature = 290
    day.nightTemperature = 280
    day.outputWeather()

}