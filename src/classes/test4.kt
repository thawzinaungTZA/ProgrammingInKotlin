package classes

class Address {
    var name: String = ""
    var street: String = ""
    var city: String = ""
    var state: String? = ""
    var zip: String = ""
}

fun copyAddress(address: Address): Address {
    val result = Address() // there's no 'new' keyword in Kotlin result.name = address.name // accessors are called result.street = address.street
    result.name = address.name
    result.street = address.street

    return result
}

fun main(args: Array<String>) {
    val teacher = Teacher()
    teacher.name = "Thaw"
    println(teacher.isEmpty)

    teacher.age = 1
    println(teacher.age)

    teacher.stringRepresentation = "RepString"
    println(teacher.stringRepresentation)
    println(teacher.rep)
}

class Teacher {
    var name: String? = null
    val isEmpty: Boolean
        get() = this.name.isNullOrEmpty()

    var stringRepresentation: String
        get() = "Name: $name, Age: $age"
        set(value) {
            rep = value // parses the string and assigns values to other properties
        }

    var rep: String = ""

    var age: Int = 25 // Note: the initializer assigns the backing field directly
        get() = 20
        set(value) {
            if (value >= 20) field = value
        }
}