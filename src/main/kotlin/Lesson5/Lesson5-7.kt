package org.example.Lesson5

fun main() {
    print("Введите расстояние поездки: ")
    val distanceOfWay = readln().toDouble()
    print("Расход топлива на 100 км: ")
    val fuelConsumption = readln().toDouble()
    print("Введите цену топлива за литр: ")
    val priceForFuel = readln().toDouble()

    val totalFuel = (distanceOfWay * fuelConsumption) / HUNDRED_KILOMETERS

    val totalPrice = totalFuel * priceForFuel

    println(String.format("Сумма за %.2f топлива равна: %.2f", totalFuel, totalPrice))
}

const val HUNDRED_KILOMETERS = 100.0