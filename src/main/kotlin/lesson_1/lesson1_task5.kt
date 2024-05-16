package org.example.lesson_1

fun main() {
    var seconds = 6480
    val hour = seconds / 3600
    val minute = seconds / 60 - hour * 60
    seconds = seconds - hour * 3600 - minute * 60

    print("%02d".format(hour))
    print(":")
    print("%02d".format(minute))
    print(":")
    print("%02d".format(seconds))
}