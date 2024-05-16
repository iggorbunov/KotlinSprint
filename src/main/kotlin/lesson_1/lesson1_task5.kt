package org.example.lesson_1

fun main() {
    var seconds = 6480
    val hoursInSeconds = 3600
    val minuteInSeconds = 60
    val hoursInMinute = 60

    val hour = seconds / hoursInSeconds
    val minute = seconds / minuteInSeconds - hour * hoursInMinute
    seconds = seconds - hour * hoursInSeconds - minute * minuteInSeconds

    print("${"%02d".format(hour)}:${"%02d".format(minute)}:${"%02d".format(seconds)}")
}