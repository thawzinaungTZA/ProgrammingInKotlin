package classes

//sampleStart
//open class Base(val name: String) {
//    init {
//        println("Initializing Base")
//    }
//
//    open val size: Int =
//            name.length.also { println("Initializing size in Base: $it") }
//}
//
//class Derived(name: String,
//              val lastName: String
//) : Base(name.capitalize().also { println("Argument for Base: $it") }) {
//    init {
//        println("Initializing Derived")
//    }
//
//    override val size: Int =
//            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
//}
//sampleEnd

fun main(args: Array<String>) {
    println("Constructing Derived(\"hello\", \"world\")")
    //val d = Derived("hello", "world")

//    Foo().f()
//    println(Foo().x)
//
    Bar().f()
    println(Bar().x)

    Bar().Baz().g()
}

/*************************************/

open class Foo {
    open fun f() {
        println("Foo.f()")
    }

    open val x: Int get() = 1
}

//
//class Bar : Foo() {
//    override fun f() {
//        super.f()
//        println("Bar.f()")
//    }
//
//    override val x: Int get() = super.x + 1
//}

class Bar : Foo() {
    override fun f() {

    }

    override val x: Int get() = 0

    inner class Baz {
        fun g() {
            super@Bar.f() // Calls Foo's implementation of f()
            println(super@Bar.x) // Uses Foo's implementation of x's getter }
        }
    }
}