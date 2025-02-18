package org.example.Lesson3

fun main() {
    var locate = "E2"
    var way = "E4"
    var numberOfMove = 1
    var move = "$locate-$way;$numberOfMove"

    println(move)

    locate = "D2"
    way = locate[0] + (locate[1] + 1).toString() // - пример как можно вычислить ход пешки
    numberOfMove += 1
    move = "$locate-$way;$numberOfMove"

    println(move)

}