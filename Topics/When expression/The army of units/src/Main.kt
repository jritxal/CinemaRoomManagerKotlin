const val FEW = 4
const val SEVERAL = 9
const val PACK = 19
const val LOTS = 49
const val HORDE = 99
const val THRONG = 249
const val SWARM = 499
const val ZOUNDS = 999
fun main() {
    println(
        when (readln().toInt()) {
            in Int.MIN_VALUE..0 -> "no army"
            in 1..FEW -> "few"
            in FEW + 1..SEVERAL -> "several"
            in SEVERAL + 1..PACK -> "pack"
            in PACK + 1..LOTS -> "lots"
            in LOTS + 1..HORDE -> "horde"
            in HORDE + 1..THRONG -> "throng"
            in THRONG + 1..SWARM -> "swarm"
            in SWARM + 1..ZOUNDS -> "zounds"
            else -> "legion"
        }
    )
}