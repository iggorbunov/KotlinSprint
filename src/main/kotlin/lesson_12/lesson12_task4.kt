package org.example.lesson_12

const val KELVIN_TEMPERATURE = 273

class Weather4(
    dayTemperature: Int,
    nightTemperature: Int,
    precipitation: Boolean = false,
) {


    init {
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
    val day = Weather4(300,290)
}