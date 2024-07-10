package kotlinTour.types

fun main() {
    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
    riversArray += "Mississippi"
    println(riversArray.joinToString())
    creatingArrays()
    modifyingArrays()
    variablesNumbersOfArguments()
    comparingArrays()
}

fun creatingArrays() {
    val simpleArray = arrayOf(1, 2, 3)
    println(simpleArray.joinToString())

    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())

    val initArray = Array<Int>(3) { 4 }
    println(initArray.joinToString())

    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { print(it) }

    val initArray2: Array<Array<Int>> = Array(2) { Array(2) { 0 } }
    println(initArray2.contentDeepToString())
}

fun modifyingArrays(){
    val simpleArray = arrayOf(1,2,3)
    val twoDArray = Array(2){Array<Int>(2) {0} }

    simpleArray[0] = 10
    twoDArray[0][0] = 2

    println(simpleArray[0])
    println(twoDArray[0][0])
}

fun variablesNumbersOfArguments(){
    var house = "house"
    var cat = "cat"
    var names:Array<String>  = arrayOf("gabriel, angelo, thiago")
    fun printVariables(vararg names:String) = names.forEach {name -> println(name) }

    printVariables(house, cat, *names)
}

fun comparingArrays(){
    val simpleArray = arrayOf(1,2,3)
    val anotherArray = arrayOf(1,2,3)

    println(simpleArray.contentEquals(anotherArray))
    println(simpleArray contentEquals anotherArray )
}