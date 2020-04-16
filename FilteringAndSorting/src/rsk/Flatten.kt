package rsk

fun main(args: Array<String>) {
    val meeting = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committe Meeting"))

    val people = meeting
        .flatMap(Meeting::people)
        .distinct()

    for(p in people) println(p.name)
}