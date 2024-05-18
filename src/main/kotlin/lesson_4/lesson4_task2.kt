package org.example.lesson_4
const val FROM_WEIGHT = 35
const val BEFORE_WEIGHT = 100
const val CAPACITY = 100

fun main() {
    val weightCargo1 = 20
    val capacityCargo1 = 80
    val weightCargo2 = 50
    val capacityCargo2 = 100

    println("Груз с весом $weightCargo1 кг и объемом $capacityCargo1 л соответствует категории 'Average': " +
            "${weightCargo1 > FROM_WEIGHT && weightCargo1 <= BEFORE_WEIGHT && capacityCargo1 < CAPACITY}\n" +
            "Груз с весом $weightCargo2 кг и объемом $capacityCargo2 л соответствует категории 'Average': " +
            "${weightCargo2 > FROM_WEIGHT && weightCargo2 <= BEFORE_WEIGHT && capacityCargo2 < CAPACITY}"
    )
}