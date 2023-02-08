const val GRAVITY = 9.8
fun main() {
    // write your code here
    val g = GRAVITY
    val p = readln().toDouble()
    val h = readln().toDouble()

    println(g * p * h)
}