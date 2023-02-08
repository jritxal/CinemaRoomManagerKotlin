package cinema

const val REGULAR_PRICE = 10
const val DISCOUNT_PRICE = 8
const val LARGE_ROOM_DELIMETER = 60

fun main() {

    var purchasedTickets = 0
    var currentIncome = 0

    println("Enter the number of rows:")
    val maxRows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seatsPerRow = readln().toInt()

    val cinema = mutableListOf<MutableList<Char>>()
    repeat(maxRows + 1) {
        cinema.add(mutableListOf<Char>())
    }

    setCinema(maxRows, seatsPerRow, cinema)

    println()
    println(
        """1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit"""
    )
    var option = readln().toInt()
    while (option != 0) {

        when (option) {
            1 -> printCinema(maxRows, seatsPerRow, cinema)
            2 -> {
                println()
                println("Enter a row number:")
                val rowNumber = readln().toInt()
                println("Enter a seat number in that row:")
                val seatNumber = readln().toInt()

                if (rowNumber > maxRows || seatNumber > seatsPerRow) {
                    println("Wrong input!")
                    continue
                }

                if (cinema[rowNumber][seatNumber] == 'B') {
                    println("That ticket has already been purchased!")
                    continue
                }

                if (maxRows * seatsPerRow <= LARGE_ROOM_DELIMETER) {
                    println("Ticket price: \$$REGULAR_PRICE")
                    currentIncome += REGULAR_PRICE
                } else {
                    if (rowNumber <= maxRows / 2) {
                        println("Ticket price: \$$REGULAR_PRICE")
                        currentIncome += REGULAR_PRICE
                    } else {
                        println("Ticket price: \$$DISCOUNT_PRICE")
                        currentIncome += DISCOUNT_PRICE
                    }
                }
                cinema[rowNumber][seatNumber] = 'B'
                purchasedTickets++
            }
            3 -> {
                val totalIncome = {
                    if (maxRows * seatsPerRow <= LARGE_ROOM_DELIMETER) {
                        maxRows * seatsPerRow * REGULAR_PRICE
                    } else {
                        ((maxRows / 2) * seatsPerRow * REGULAR_PRICE) + ((maxRows - (maxRows / 2)) * seatsPerRow * DISCOUNT_PRICE)
                    }
                }
                val percentage = (purchasedTickets.toFloat() / (maxRows * seatsPerRow)) * 100
                val percentageFormatted = "%.2f".format(percentage)
                println(
                    """Number of purchased tickets: ${purchasedTickets}
Percentage: ${percentageFormatted}%
Current income: ${'$'}${currentIncome}
Total income: ${'$'}${totalIncome.invoke()}"""
                )
            }
        }

        println()
        println(
            """1. Show the seats
2. Buy a ticket
3. Statistics
0. Exit"""
        )
        option = readln().toInt()
    }

}

private fun setCinema(
    maxRows: Int,
    seatsPerRow: Int,
    cinema: MutableList<MutableList<Char>>
) {
    var rows = 0
    var cols = 0


    while (rows <= maxRows) {
        while (cols <= seatsPerRow) {
            if (rows == 0 && cols == 0) {
                cinema[rows].add(' ')
            } else if (rows == 0) {
                cinema[rows].add(cols.toString()[0])
            } else if (cols == 0) {
                cinema[rows].add(rows.toString()[0])
            } else {
                cinema[rows].add('S')
            }
            cols++
        }
        cols = 0
        rows++
    }
}

private fun printCinema(
    maxRows: Int,
    seatsPerRow: Int,
    cinema: MutableList<MutableList<Char>>
) {
    var rows = 0
    var cols = 0


    println()
    println("Cinema:")

    while (rows <= maxRows) {
        while (cols <= seatsPerRow) {

            print(cinema[rows][cols])
            print(' ')
            cols++
        }
        println()
        cols = 0
        rows++
    }
}
