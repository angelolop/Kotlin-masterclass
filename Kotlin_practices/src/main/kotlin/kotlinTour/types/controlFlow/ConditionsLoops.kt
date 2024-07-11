package kotlinTour.types.controlFlow

import kotlin.random.Random

fun main() {
    var max = "string"
    if (max is String) println("string") else println("not a string")
    if (max is String) print("string")

    val maximum:Any = if (max is String) {
        println("string")
        max
    } else {
        2
    }
}

fun usingWhen() {
    val x = Random(10).nextInt()
    when (x){
        1 -> print("1")
        2 -> print("2")
        else -> {
            print("not 1 or 2")
        }
    }
}

enum class Bit {
    ONE, ZERO
}

fun whenInline(a:Bit): Unit = when (a) {
    Bit.ONE -> println("one")
    Bit.ZERO -> println("zero")
}