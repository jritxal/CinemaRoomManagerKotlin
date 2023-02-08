const val MAX = 10
fun main() {
    val number = readln().toInt()

    println(number !in 1..MAX)
}