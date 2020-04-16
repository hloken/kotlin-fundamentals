package rsk

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)
    var greaterThanThree = {v:Int -> v>3}

    var largeInts = ints.all(greaterThanThree)
    println(largeInts)

    largeInts = ints.any(greaterThanThree)
    println(largeInts)

    var numberOfLargeInts = ints.count(greaterThanThree)
    println(numberOfLargeInts)

    var found: Int? = ints.find{ it>6 }
    println(found)
}