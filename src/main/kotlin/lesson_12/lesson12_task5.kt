package org.example.lesson_12

import kotlin.random.Random

class Weather5(dayTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    var dayTemperature = dayTemperature
    var nightTemperature = nightTemperature
    var precipitation = precipitation
}

fun main() {
    val whetherList: MutableList<Weather5> = mutableListOf()
    val dayList: MutableList<Int> = mutableListOf()
    val nightList: MutableList<Int> = mutableListOf()
    val precipitationDay: MutableList<Int> = mutableListOf()

    for (i in 1..30) whetherList.add(Weather5(Random.nextInt(19, 25), Random.nextInt(12, 19), Random.nextBoolean()))
    for (i in 0..29) {
        dayList.add(whetherList[i].dayTemperature)
        nightList.add(whetherList[i].nightTemperature)
        if (whetherList[i].precipitation == true) precipitationDay.add(i)
    }
    println(
        """
        Средняя температура днем: ${dayList.average()}
        Средняя температура ночью: ${nightList.average()}
        Количество дней с осадками: ${precipitationDay.size}
        """.trimIndent()
    )
}