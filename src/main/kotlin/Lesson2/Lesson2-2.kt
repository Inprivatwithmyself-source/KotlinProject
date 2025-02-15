fun main() {
    val countOfWorkers = 50
    val salaryOfWorkers = 30000
    val countOfInterns = 30
    val salaryOfInterns = 20000

    val expensesWorkers = countOfWorkers * salaryOfWorkers
    val generalExpenses = (countOfInterns * salaryOfInterns) + expensesWorkers
    val avgSalary = generalExpenses / (countOfWorkers + countOfInterns)

    println(expensesWorkers)
    println(generalExpenses)
    println(avgSalary)
}