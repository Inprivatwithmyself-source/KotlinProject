package org.example.Lesson5

import kotlin.random.Random

fun main() {
    val number1 = Random.nextInt(1, 100)
    val number2 = Random.nextInt(1, 100)
    val numberOfAction = Random.nextInt(0, 2)
    val totalResult: Int
    val action: String

    when (numberOfAction) {
        0 -> {
            totalResult = number1 - number2
            action = "-"
        }
        1 -> {
            totalResult = number1 + number2
            action = "+"
        }
        else -> {
            totalResult = number1 * number2
            action = "*"
        }
    }

    print("Введите ответ на формулу: $number1 $action $number2 = ")
    val resultFromUser = readln().toInt()

    if (resultFromUser == totalResult) {
        println(AUTHORIZATION_ALLOWED)
    } else {
        println(AUTHORIZATION_FAILED)
    }


}

const val AUTHORIZATION_ALLOWED = "Добро пожаловать!"
const val AUTHORIZATION_FAILED = "Доступ запрещён"