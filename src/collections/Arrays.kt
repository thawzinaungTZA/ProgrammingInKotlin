package collections

/**
 *
 */
fun main(args: Array<String>) {
    val evenNumbers = arrayOf(2, 4, 6, 8)
    val evenNumbers2: Array<Int> = arrayOf(2, 4, 6, 8)
    val intNumbers = intArrayOf(2,4,6,8)
    var players = arrayOf("Alice", "Bob", "Cindy", "Dan")
    println("players ${players.size}")

    players += "Gina"

    if (players.size < 2) {
        println("We need at least two players!")
    } else {
        println("let's start!")
    }

    println(players.isEmpty())

    var currentPlayer = players.first()
    println(currentPlayer)

    var firstPlayer = players[0]
    println("First player is $firstPlayer")
    println()

//    var lastPlayer = players[4]
//    println("Last player is $lastPlayer")

    val upcomingPlayers = players.sliceArray(0..2)
    for (upcomingPlayer in upcomingPlayers) {
        println(upcomingPlayer)
    }
    println()

    fun isEliminated(player: String) : Boolean {
        return !players.contains(player)
    }
    println(isEliminated("Bob"))
    println(isEliminated("Fred"))
    println()

    for (player in players) {
        println(player)
    }
    println()

    players[2] = "Sammy"
    for (player in players) {
        println(player)
    }
//    for ((index, value) in players.withIndex()) {
//        println("Value $value at index $index")
//    }
    println()

    fun sumOfAllItems(array: Array<Int>) : Int {
        var sum = 0
        for (number in array) {
            sum += number
        }
        return sum
    }

    val prices = arrayOf(1, 5, 20, 50)
    val removeFirst = prices.drop(1)
    for (price in removeFirst) {
        println(price)
    }
    println()

    val removeFirstTwo = prices.drop(2)
    for (price in removeFirstTwo) {
        println(price)
    }
    println()


    val removeLast = prices.dropLast(1)
    for (price in removeLast) {
        println(price)
    }
    println()

    val removeLastTwo = prices.dropLast(2)
    for (price in removeLastTwo) {
        println(price)
    }
    println()

    prices.forEach {
        println(it)
    }
}