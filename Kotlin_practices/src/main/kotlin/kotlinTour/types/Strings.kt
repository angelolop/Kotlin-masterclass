package kotlinTour.types

fun main(){
    val str = "abcd 123"
    val str2:String = "abcd 123"

    for (char in str){
        print(char)
    }
    trillingLines()
    template()
    stringFormats()
}

fun trillingLines(){
    val text = """
    |Estudando kotlin.
    |Pulando linhas.
    |Uma ótima linguagem.
    |(Angelo Lopes)
    """
    print(text)
}

fun template() {
    val i = 10
    println("i = $i")

    val letters = listOf("a","b","c","d","e")
    println("Letters: $letters")
}

fun stringFormats(){
    val integerNumber = String.format("%07d", 31416)
    println(integerNumber)

    val floatNumber = String.format("%+.4f", 3.141592)
    println(floatNumber)

    val helloString = String.format("%S %S", "hello", "world")
    println(helloString)

    val negativeNumberInParentheses = String.format("%(d means %1\$d", -31416)
    println(negativeNumberInParentheses)
}