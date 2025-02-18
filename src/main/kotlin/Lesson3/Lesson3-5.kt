package org.example.Lesson3

fun main() {
    val move = "D2-D4;0"
    val locate = move.first() + move[1].toString()
    val way = move[3] + move[4].toString()
    val numberOfMove = move.last()

    println(locate)
    println(way)
    println(numberOfMove)
}