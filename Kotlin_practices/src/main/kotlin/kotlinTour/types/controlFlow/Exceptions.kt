package kotlinTour.types.controlFlow

fun main(){
    throw Exception("Hi")
    tryingAndCatching()
    println(a) //unreachable
}

fun tryingAndCatching(){
    try {
        throw Exception()
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("finished!")
    }
}

var input:String = "34"

val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }
