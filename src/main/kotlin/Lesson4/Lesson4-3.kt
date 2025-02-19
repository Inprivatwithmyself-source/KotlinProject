package org.example.Lesson4

fun main() {
    val weatherNow = "солнечная"
    val tentNow = "открыт"
    val wetNow = 20
    val seasonNow = "зима"

    val naturalCondition = (weatherNow == WEATHER) &&
            (tentNow == TENT) &&
            (wetNow == WET_AIR) &&
            (seasonNow != SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $naturalCondition")

}

const val WEATHER = "солнечная"
const val TENT = "открыт"
const val WET_AIR = 20
const val SEASON = "зима"