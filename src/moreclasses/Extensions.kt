package moreclasses

/**
 *
 */
fun String.lastChar() : Char = this.get(this.length-1)

fun Int.square() : Int = this * this

fun String.length(): Int = this.length


fun main(args: Array<String>) {
    println("The last character of \"My Text\" is ${"My Text".lastChar()}")

    println(3.square())
}