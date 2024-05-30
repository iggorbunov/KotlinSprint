package org.example.lesson_1_10.lesson_4

const val SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val AIR_HUMIDITY = 20
const val SEASON = "не зима"

fun main() {
    val weatherSunny: Boolean = true
    val awningOpen: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = "зима"

    val goodConditions = (SUNNY_WEATHER == weatherSunny) && (OPEN_AWNING == awningOpen) && (AIR_HUMIDITY == airHumidity) && (SEASON == currentSeason)

    println("Благоприятные ли условия сейчас для роста бобовых? $goodConditions")
}