package kotlinTour

fun main(){
    println("Hello, world!")
    variables()
    stringTemplates()
}

fun variables(){
    val popcorn = 5
    val hotdog = 7
    var customers = 10

    customers = 8
    println(customers)
}

fun stringTemplates(){
    val customers = 10
    println("There are $customers customers")

    println("There are ${customers + 1} customers")
}