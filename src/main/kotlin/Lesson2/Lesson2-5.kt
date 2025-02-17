package org.example.Lesson2

import kotlin.math.pow

fun main() {
    val contribution = 70000
    val yearsOfContribution = 20.0

    val compoundPercent = contribution * ((1 + PERCENT / 100).pow(yearsOfContribution))

    println(String.format("%.3f", compoundPercent))
}

const val PERCENT = 16.7