package org.example.Lesson4

fun main() {
    val tablesToday = 13
    val tablesTomorrow = 9

    println("Доступность столиков на сегодня: ${tablesToday < TABLES_IN_RESTAURANT}")
    println("Доступность столиков на завтра: ${tablesTomorrow < TABLES_IN_RESTAURANT}")
}
const val TABLES_IN_RESTAURANT = 13