package org.example.lesson_1_10.lesson_1

const val HOURS_IN_SECONDS = 3600
const val MINUTE_IN_SECONDS = 60
const val HOURS_IN_MINUTE = 60

fun main() {
    var seconds = 6480

    val hours = seconds / HOURS_IN_SECONDS
    val minutes = seconds / MINUTE_IN_SECONDS - hours * HOURS_IN_MINUTE
    seconds = seconds - hours * HOURS_IN_SECONDS - minutes * MINUTE_IN_SECONDS

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}