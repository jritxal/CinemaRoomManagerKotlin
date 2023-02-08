import kotlin.math.abs

const val DECIMAL_NUMERIC_BASE = 10

fun getLastDigit(number: Int) = abs(number % DECIMAL_NUMERIC_BASE)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}