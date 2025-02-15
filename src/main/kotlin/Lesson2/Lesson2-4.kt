package org.example.Lesson2

fun main() {
    val quantOfCrystal = 7
    val quantOfIron = 11

    val crystalWithBuff = (quantOfCrystal * buffInPercent).toInt()
    val ironWithBuff = (quantOfIron * buffInPercent).toInt()

    println(crystalWithBuff)
    println(ironWithBuff)

}
const val buffInPercent = 1.2