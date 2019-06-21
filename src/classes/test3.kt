package classes

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // interface members are 'open' by default fun b() { print("b") }
}

class C : A(), B {
    // The compiler requires f() to be overridden:
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f() }
    }
}

fun main(args: Array<String>) {
    C().f()

    MyClass.Factory.create()
    MyClass.create()
    MyClass().test()
    println()

    Der().f()

    val str = String()
    val address = Address()
    var a = address

    ff(address)
}

fun ff(st: Address) {

}

class Der : Base() {
    override fun f() {
        super.f()
        println("Der function f")
    }
}

open class Base {
    open fun f() {
        println("Base Function f")
    }
}

abstract class Derived : Base() {
    abstract override fun f()
}

class Test: Derived() {
    override fun f() {

    }

}

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }

    fun test() {

    }
}