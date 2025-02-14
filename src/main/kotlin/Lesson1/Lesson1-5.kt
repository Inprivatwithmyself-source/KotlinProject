fun main() {
    val seconds: Int = 6480
    val divisorOfTime = 60
    val minutes: Int = seconds / divisorOfTime
    val hours: Int = minutes / divisorOfTime
    val remaindersOfMinutes: Int = minutes % divisorOfTime
    val remainderOfSeconds: Int= remaindersOfMinutes / divisorOfTime

    val timeInSpace = String.format("0%d:%d:0%d", hours, remaindersOfMinutes, remainderOfSeconds)

    println(timeInSpace)
}
