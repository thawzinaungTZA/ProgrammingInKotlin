package classes

//open class Base {
//    open fun v() {}
//    fun nv() {}
//}
//
//class Derived() : Base() {
//    override fun v() {
//        super.v()
//    }
//}

/******************************************************/

//open class Foo {
//    open val x: Int get() = 0
//    open var y: Int = 0
//}
//class Bar1 : Foo() {
//    override val x: Int
//        get() = 3
//    override var y: Int
//        get() = 8
//        set(value) { value * value }
//}

/******************************************************/

//interface Foo {
//    val count: Int
//}
//
//class Bar1(override val count: Int) : Foo
//
//class Bar2 : Foo {
//    override var count: Int = 0
//}
