package org.example.Lesson5

fun main() {


    print("Введите свой вес в кг: ")
    val weight = readln().toFloat()
    print("Введите свой рост в сантиметрах: ")
    val height = readln().toFloat()
    val heightInMeters = height / METER

    val bodyMassIndex = weight / (heightInMeters * heightInMeters)

    when {
        bodyMassIndex < underweight -> println(String.format("Ваш ИМТ: %.2f. Недостаточная масса тела", bodyMassIndex))
        bodyMassIndex < commonWeight -> println(String.format("Ваш ИМТ: %.2f. Нормальная масса тела", bodyMassIndex))
        bodyMassIndex < overweight -> println(String.format("Ваш ИМТ: %.2f. Избыточная масса тела", bodyMassIndex))
        else -> println(String.format("Ваш ИМТ: %.2f. У вас ожирение!", bodyMassIndex))

    }


}

const val METER: Float = 100.0F
const val underweight = 18.5f
const val commonWeight = 25f
const val overweight = 30f
