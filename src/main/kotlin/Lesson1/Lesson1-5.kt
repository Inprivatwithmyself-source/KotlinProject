 fun main() {
    val seconds: Int = 6480
    val minutes: Int = seconds/60
    val hours: Int = minutes/60
    val remaindersOfMinutes = minutes%60
    val remainderOfSeconds: Int = remaindersOfMinutes/60
    println("0$hours:$remaindersOfMinutes:$remainderOfSeconds$remainderOfSeconds")
}
