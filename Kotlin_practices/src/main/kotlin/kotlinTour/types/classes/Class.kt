package kotlinTour.types.classes

fun main() {

}

class Person(name:String)

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Owner{
    var person:Person

    constructor(person: Person){
        this.person = person
    }

}

class School(val alumni: String) {
    val teachers: MutableList<School> = mutableListOf()
    constructor(alumni: String, elementary: School) : this(alumni) {
        elementary.teachers.add(this)
    }
}