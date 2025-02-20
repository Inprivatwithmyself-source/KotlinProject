package org.example.Lesson5

fun main() {
    val underweight = 0f..<18.5f
    val commonWeight =  18.5f..<25f
    val overweight = 25f..<30f
    val obesity = 30f..100f


    print("Введите свой вес в кг: ")
    val weight = readln().toFloat()
    print("Введите свой рост в сантиметрах: ")
    val height = readln().toFloat()
    val heightInMeters = height/ METER

    val bodyMassIndex = weight/(heightInMeters * heightInMeters)

    if (bodyMassIndex in underweight) {
        println(String.format("Ваш ИМТ: %.2f. Ваша категория: недостаточная масса тела", bodyMassIndex))
    }
    else if (bodyMassIndex in commonWeight) {
        println(String.format("Ваш ИМТ: %.2f. Ваша категория: нормальная масса тела", bodyMassIndex))
    }
    else if (bodyMassIndex in overweight) {
        println(String.format("Ваш ИМТ: %.2f. Ваша категория: избыточная масса тела", bodyMassIndex))
    }
    else if (bodyMassIndex in obesity) {
        println(String.format("Ваш ИМТ: %.2f. Ваша категория: ожирение", bodyMassIndex))
    }


}
const val METER: Float = 100.0F
