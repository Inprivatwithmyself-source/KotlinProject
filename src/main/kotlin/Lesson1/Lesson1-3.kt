import kotlin.math.min

fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"

    println(year)
    println(hour)
    println(minute)
    println("$hour:$minute")

    hour = "10"
    minute = "55"

    val timeOfSit = "$hour:$minute"
    println(timeOfSit)
}

