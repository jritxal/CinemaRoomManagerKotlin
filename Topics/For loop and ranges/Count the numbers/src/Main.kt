fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var counter = 0

    for (x in a..b) {
        if (x % n == 0) {
            counter++
        }
    }

    println(counter)
}