fun main() {
    val size = readln().toInt()
    val numbers = mutableListOf<Int>()
    repeat(size) {
        numbers.add(readln().toInt())
    }
    if (readln().toInt() in numbers) {
        println("YES")
    } else {
        println("NO")
    }
}