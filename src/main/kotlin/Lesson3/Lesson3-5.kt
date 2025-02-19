package org.example.Lesson3

fun main() {
    val move = "D2-D4;0"
    val locate = move.split("-", ";")

    println(locate[0])
    println(locate[1])
    println(locate[2])
}