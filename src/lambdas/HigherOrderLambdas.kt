package lambdas

/**
 *
 */
fun main(args: Array<String>) {
    val ints = listOf(2, 3, 20, 50)
    println(ints.filter { it > 10 })

    val myStringList = listOf("Sam", "aa", "Suzzy", "Jesse", "Ray", "Kevin")
    val updatedList = myStringList.filter{ it.length > 4 }.sortedBy{ it }
    println(updatedList)

//    view.onClickListener {println("In Clicklistener"}

}