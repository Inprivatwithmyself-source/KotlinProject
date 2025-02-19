package Lesson5

import java.time.Year

fun main() {
    val currentYear = Year.now().value

    print("Введите ваш год рождения: ")
    val yearOfBirthday = readln().toInt()

    val ageOfUser = currentYear - yearOfBirthday

    if (ageOfUser >= ACCEPTABLE_AGE) {
        println("Показать экран со скрытым контентом.")
    }
    else {
        println("Ваш возраст неприемлем для данного контента.")
    }



}
const val ACCEPTABLE_AGE = 18

