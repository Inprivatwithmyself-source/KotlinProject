package org.example.Lesson4

fun main() {
    print("Введите день тренировки: ")
    val dayOfTraining = readln().toInt()
    val recommendation1: Boolean
    val recommendation2: Boolean

    if (dayOfTraining % 2 == 0) {
        recommendation1 = false
        recommendation2 = true
        println("Упражнение для рук $recommendation1")
        println("Упражнение для пресса: $recommendation1")
        println("Упражнение для спины: $recommendation2")
        println("Упражнение для ноги: $recommendation2")
    }
    else if (dayOfTraining % 2 != 0) {
        recommendation1 = true
        recommendation2 = false
        println("Упражнение для рук $recommendation1")
        println("Упражнение для пресса: $recommendation1")
        println("Упражнение для спины: $recommendation2")
        println("Упражнение для ноги: $recommendation2")
    }

}