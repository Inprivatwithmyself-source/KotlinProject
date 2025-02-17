package org.example.Lesson2

fun main() {
    val quantOfCrystal = 7
    val quantOfIron = 11

    val crystalWithBuff = (quantOfCrystal * (1 + BUFF / DIVIDER_FOR_PERCENT)).toInt()
    val ironWithBuff = (quantOfIron * (1 + BUFF / DIVIDER_FOR_PERCENT)).toInt()

    println(crystalWithBuff)
    println(ironWithBuff)

}

const val BUFF = 20.0
const val DIVIDER_FOR_PERCENT = 100