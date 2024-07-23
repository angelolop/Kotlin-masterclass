package kotlinTour.types.controlFlow

class Person(val name:String?)

fun main(){
    val person = Person(null)
    val s = person.name ?: return
    println(s)
    breakAndContinue()
}

fun breakAndContinue(){
    loop@ for (a in 1..10){
        for (b in 1..10){
            if (a == b) break@loop
        }
    }
}


