package chap04.section2

fun main() {

    var total: Int = 0

    for (num in 1..99 step 2) total += num
    println("Odd total: $total")

    total = 0
    for (num in 0..100 step 2) total += num
    println("Even total: $total")

}
