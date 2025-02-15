fun main() {
    val grade1: Int = 3
    val grade2: Int = 3
    val grade3: Int = 4
    val grade4: Int = 5

    val avgOfGrades = (grade4 + grade3 + grade2 + grade1) / 4.0

    println(String.format("%.2f", avgOfGrades))
}