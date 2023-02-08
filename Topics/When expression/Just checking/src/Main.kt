const val FOUR = 4
fun main() {
    println(
        when (readln().toInt()) {
            2 -> "Yes!"
            in 1..FOUR -> "No!"
            else -> "Unknown number"
        }
    )
}