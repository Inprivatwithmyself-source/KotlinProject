package org.example.Lesson5

import kotlin.random.Random

fun main() {
    val firstNumber = Random.nextInt(0, 42)
    val secondNumber = Random.nextInt(0, 42)

    print("Введите ваши числа: ")
    val (numberFromUser1, numberFromUser2) = readln().split(" ").map { it.toInt() }

    if (firstNumber == numberFromUser1) {
        if (secondNumber == numberFromUser2) {
            println("Поздравляем! Вы выиграли главный приз!")
        }
        else {
            println("Вы выиграли утешительный приз!")
        }
    }
    else if (firstNumber == numberFromUser2) {
        if (secondNumber == numberFromUser1) {
            println("Поздравляем! Вы выиграли главный приз!")
        }
        else {
            println("Вы выиграли утешительный приз!")
        }
    }
    else {
        println("Неудача!(")
    }
}
