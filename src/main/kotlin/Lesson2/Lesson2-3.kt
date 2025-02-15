package org.example.Lesson2

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39

    val timeForWay = 457
    val hourOfArrival =  (timeForWay + minuteDeparture) / timeMultipleDevoid + hourDeparture
    val minuteOfArrival = (timeForWay + minuteDeparture) % timeMultipleDevoid

    println(String.format("%02d:%02d", hourOfArrival, minuteOfArrival))

}
const val timeMultipleDevoid = 60