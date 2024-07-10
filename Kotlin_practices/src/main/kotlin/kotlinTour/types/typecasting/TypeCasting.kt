package kotlinTour.types.typecasting

class Cat {
    fun purr() {
        println("Purr purr")
    }
}

fun petAnimal(animal: Any) {
    val isCat = animal is Cat
    if (isCat) {
        (animal as Cat).purr()
    }
}

fun main() {
    var string:String? = "string"
    if (string is String){
        println("is string")
    }

    if (string !is String) {
        println("is not a string")
    }
    val kitty = Cat()
    petAnimal(kitty)
    inlineLambda {println("testing") }
    inlineLambda2("status") {str -> println(str)}
}

interface Status {
    fun signal(){}
}

interface Ok : Status
interface Postponed : Status
interface Declined : Status

fun signalCheck(signalStatus:Any){
    if (signalStatus is Postponed || signalStatus is Declined){
        (signalStatus as Status).signal()
    }
}

fun testing(test:Any) = if (test is String) println("string") else print("Not string")
inline fun inlineLambda(lambda: () -> Unit) = lambda()
inline fun inlineLambda2(string:String, lambda: (a:String) -> Unit) = lambda(string)