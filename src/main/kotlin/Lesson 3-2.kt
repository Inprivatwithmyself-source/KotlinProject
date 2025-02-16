package org.example

fun main() {
    val name = "Татьяна"
    val patronymic = "Андреева"
    var surname = "Сергеевна"
    var age = 20

    println("ФИО: $patronymic $name $surname. Возраст: $age")

    age = 22
    surname = "Сидорова"

    println("ФИО: $patronymic $name $surname. Возраст: $age")
}