package org.example.Lesson3

fun main() {
    var greet = "Добрый день"
    print("Введите ваше имя: ")
    val name = readln()
    println("$greet $name!")

    greet = "Добрый вечер"
    println("$greet $name!")
}