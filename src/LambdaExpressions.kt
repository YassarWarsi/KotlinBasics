fun toSeconds(time: String) : (Int) -> Int = when(time){
    "hour" -> {value -> value * 60 * 60}
    "minutes" -> {value -> value * 60}
    "seconds" -> {value -> value}
    else -> {value -> value}
}

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter({ x -> x > 0 })

    println("Positives - $positives")

    val isNegative = {x :Int -> x < 0}
    val negatives = numbers.filter(isNegative)

    println("Negatives - $negatives")

    println("--------------------------------")

    val timeInMinutes = listOf<Int>(2,5,10)
    val minutesToSeconds = toSeconds("minutes")
    val totalTimeSum = timeInMinutes.map(minutesToSeconds).sum();
    println(totalTimeSum)


}