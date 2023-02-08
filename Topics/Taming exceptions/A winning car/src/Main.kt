const val SPEED_LIMIT = 120
const val ACC_LIMIT = 4
fun findCar(): String {
    val maxSpeed = readln().toInt()
    val accTime = readln().toInt()

    // write your code here
    if (maxSpeed < SPEED_LIMIT) {
        throw Exception("The race can't be won with this car")
    }
    if (accTime !in 1..ACC_LIMIT) {
        throw Exception("The race can't be won with this car")
    }
    return "I will definitely win!"
}