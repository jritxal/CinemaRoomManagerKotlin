fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val fourth = readln().toInt()
    val fith = readln().toInt()

    println(fith in first..second || fith in third..fourth)
}