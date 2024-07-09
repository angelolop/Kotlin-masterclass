package kotlinTour.types

fun main(){
    val one = 1
    val threeBillion = 3000000000
    val oneLong = 1L
    val oneByte: Byte = 1
    var two:Float = 2.0F
    var three:Double = 2.0
    printDouble(three)
    nullable()
}

fun printDouble(a:Double){
    println(a)
}

fun nullable(){
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)

}