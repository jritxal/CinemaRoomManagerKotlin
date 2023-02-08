fun main() {
    val numberOfCompanies = readln().toInt()
    val incomes = mutableListOf<Int>()
    val taxes = mutableListOf<Int>()
    val total = mutableListOf<Int>()

    repeat(numberOfCompanies) {
        incomes.add(readln().toInt())
    }

    repeat(numberOfCompanies) {
        taxes.add(readln().toInt())
    }

    for (i in 0 until numberOfCompanies) {
        total.add(incomes[i] * taxes[i])
    }

    println(total.indexOf(total.maxOrNull()) + 1)
}