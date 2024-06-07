package org.example.lesson_12

import kotlin.random.Random

const val KELVIN_TEMPERATURE = 273

class Weather5(var dayTemperature: Int, var nightTemperature: Int, var precipitation: Boolean) {

    init {
        this.dayTemperature = dayTemperature - KELVIN_TEMPERATURE
        this.nightTemperature = nightTemperature - KELVIN_TEMPERATURE
    }
}

fun main() {
    val whetherList: MutableList<Weather5> = mutableListOf()
    val dayList: MutableList<Int> = mutableListOf()
    val nightList: MutableList<Int> = mutableListOf()

    for (i in 1..30) whetherList.add(Weather5(Random.nextInt(292, 298), Random.nextInt(285, 292), Random.nextBoolean()))
    whetherList.map {
        dayList.add(it.dayTemperature)
        nightList.add(it.nightTemperature)
    }
    val precipitationDay = whetherList.filterNot { it.precipitation == false }.toMutableList()
    println(
        """
        Средняя температура днем: ${dayList.average()}
        Средняя температура ночью: ${nightList.average()}
        Количество дней с осадками: ${precipitationDay.size}
        """.trimIndent()
    )
}