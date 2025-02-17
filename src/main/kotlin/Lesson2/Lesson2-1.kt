fun main() {
    val grade1 = 3.0
    val grade2 = 3.0
    val grade3 = 4.0
    val grade4 = 5.0

    val avgOfGrades = (grade4 + grade3 + grade2 + grade1) / quantOfStudents
    println(String.format("%.2f", avgOfGrades))
}
const val quantOfStudents = 4