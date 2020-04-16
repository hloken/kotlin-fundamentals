package com.rsk.kotlin

import com.rsk.java.Meeting
import com.rsk.java.Organizer

fun main(args: Array<String>)
{
    var people: MutableList<Person?>? = null

    people = mutableListOf(Person(23), Person(23))

    people.add(null)

    for (person: Person in people.filterNotNull()) {
        println(person.age)
    }
}

class Person(val age: Int) : Organizer {
    override fun processMeetings(meetings: List<Meeting>) {
        TODO("Not yet implemented")
    }
}