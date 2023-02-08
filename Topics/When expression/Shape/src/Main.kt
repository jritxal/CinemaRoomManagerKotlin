const val FOUR = 4
const val THREE = 3
fun main(args: Array<String>) {
    val number = readln().toInt()

    if (number in 1..FOUR) {
        print("You have chosen a ")
        print(
            when (number) {
                1 -> "square"
                2 -> "circle"
                THREE -> "triangle"
                FOUR -> "rhombus"
                else -> "fail"
            }
        )
    } else {
        println("There is no such shape!")
    }
}