package org.example.Lesson2

fun main() {
    val quantOfCrystal = 7
    val quantOfIron = 11

    val crystalWithBuff = (quantOfCrystal * (1 + Buff/100)).toInt()
    val ironWithBuff = (quantOfIron * (1 + Buff/100)).toInt()

    println(crystalWithBuff)
    println(ironWithBuff)

}
const val Buff = 20.0