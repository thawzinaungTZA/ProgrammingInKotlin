package classes

/**
 *
 */
fun main(args: Array<String>) {
/*
    class propertiesmethods.Person {
    }

    val person = propertiesmethods.Person()

    class propertiesmethods.Person {
        var firstName: String = ""
        var lastName: String = ""
    }

    class propertiesmethods.Person(var firstName: String, var lastName: String) {
    }

    val person = propertiesmethods.Person("Sam", "Gamgee")

    class propertiesmethods.Person(var firstName: String) {
        var lastName: String? = null

        constructor(firstName: String, lastName: String) : this(firstName) {
            this.lastName = lastName
        }
    }

    val person = propertiesmethods.Person("Sam")
    val person2 = propertiesmethods.Person("Sam", "Gamgee")

*/
    class Person(var firstName: String, var lastName: String = "Gamgee") {
    }

    val person = Person("Sam")
    val person2 = Person("Sam", "Gamgee")
    println("Person1 = ${person.firstName} ${person.lastName}")
    println ("Person2 = ${person2.firstName} ${person2.lastName}")

    AA("", "")
}

open class AA(var firstName: String,
         lastName: String) {

    var age: Int = 0
    open var aa: String = ""

    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }

    open fun f() {

    }
}

class BB: AA {
    constructor(firstName: String, lastName: String): super(firstName, lastName)

    override var aa: String = super.aa

    override fun f() {
        super.f()
    }

}