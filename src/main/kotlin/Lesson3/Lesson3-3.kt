package org.example.Lesson3

fun main() {
    print("Введите число: ")
    val factor = readln().toInt()

    println("""    
    $factor * 1 = ${factor * 1}
    $factor * 2 = ${factor * 2}
    $factor * 3 = ${factor * 3}
    $factor * 4 = ${factor * 4}
    $factor * 5 = ${factor * 5}
    $factor * 6 = ${factor * 6}    
    $factor * 7 = ${factor * 7}
    $factor * 8 = ${factor * 8}
    $factor * 9 = ${factor * 9} """)
}