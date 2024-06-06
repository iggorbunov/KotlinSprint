package org.example.lesson_12

const val KELVIN_TEMPERATURE = 273

class Weather3(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean = false,
) {


    fun outputWeather() {
        println(
            """
            Температура днем: ${dayTemperature - KELVIN_TEMPERATURE}
            Температура ночью: ${nightTemperature - KELVIN_TEMPERATURE}
            Наличие осадков: $precipitation
            
        """.trimIndent()
        )
    }
}

fun main() {
    val day = Weather3(290, 280)
    day.outputWeather()

}