package org.example.lesson_1_10.lesson_2

fun main() {
    val employeeCount = 50
    val employeeSalary = 30000
    val internCount = 20
    val internSalary = 20000

    val allEmployeeSalary = employeeCount * employeeSalary
    val allCompanySalary = allEmployeeSalary + internCount * internSalary
    val averageCompanySalary = allCompanySalary / (employeeCount + internCount)

    println(allEmployeeSalary)
    println(allCompanySalary)
    println(averageCompanySalary)
}