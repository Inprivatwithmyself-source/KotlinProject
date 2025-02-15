package org.example.Lesson2

import kotlin.math.pow

fun main() {
    val contribution = 70000
    val yearsOfContribution = 20.0

    val compoundPercent = contribution * ((1 + percent).pow(yearsOfContribution))

    println(String.format("%.3f", compoundPercent))
}
const val percent = 0.167