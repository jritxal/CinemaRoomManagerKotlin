const val A_MULT = 10.5
const val B_MULT = 4.4
const val DIVISOR = 2.2
fun main() {
    // put your code here
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val d = readln().toDouble()

    println(a * A_MULT + b * B_MULT + (c + d) / DIVISOR)
}