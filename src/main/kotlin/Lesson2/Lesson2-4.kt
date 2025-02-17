package org.example.Lesson2

fun main() {
    val quantOfCrystal = 7
    val quantOfIron = 11

    val crystalWithBuff = (quantOfCrystal * (1 + BUFF/100)).toInt()
    val ironWithBuff = (quantOfIron * (1 + BUFF/100)).toInt()

    println(crystalWithBuff)
    println(ironWithBuff)

}
const val BUFF = 20.0