package kotlinTour

fun main(){
    var customers = 10

    customers = 8

    customers = customers + 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3

    println(customers)
    numbers()
}

fun numbers(){
    val threeLong = 3L;
    val three = 3;
    print("$threeLong + $three")
}