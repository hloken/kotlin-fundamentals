package rsk

fun iter(seq:Sequence<String>) {
    for(t in seq) println(t)
}

fun main(args: Array<String>) : Unit {
    var ints = listOf(1, 2, 3, 4, 5)

    var smallInts = ints.filter{ it < 4 }

    for(i:Int in smallInts) println(i)

    var squaredInts = ints.map { it*it }

    for(i:Int in squaredInts) println(i)

    var smallSquaredInts = ints
        .filter{ it < 5 }
        .map{ it * it }

    for(i:Int in smallSquaredInts) println(i)

    var meetings = listOf(Meeting(1, "Board meeting"), Meeting(2, "Committe Meeting"))

//    var titles: List<String> = meetings
//        .filter { it.title.startsWith("C")}
//        .map { m->m.title }
//
//    for (t in titles) println(t)

    var titles2 = meetings
        .asSequence()
        .filter{ println("filter($it)"); it.title.endsWith("g")}
        .map{ println("map($it)"); it.title }

    iter(titles2)
//    for (t in titles2) println(t)
//
//    val title = meetings
//        .asSequence()
//        .map{ println("map($it)"); it.title.toUpperCase()}
//        .find{ it.startsWith("BOARD")}
//
//    println(title)
}

