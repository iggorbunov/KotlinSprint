package org.example.lesson_12

class Weather4 {
    var dayTemperature = 20
    var nightTemperature = 15
    var precipitation = false

    init {
        println(
            """
            Температура днем: ${dayTemperature}
            Температура ночью: ${nightTemperature}
            Наличие осадков: $precipitation
            
        """.trimIndent()
        )
    }
}

fun main() {
    val day = Weather4()
}