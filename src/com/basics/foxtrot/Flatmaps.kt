package com.basics.foxtrot

import com.basics.echo.Meeting

class Person(val name: String)

data class Meetings(val id: Int, val title: String) {
    val people = listOf(Person("Joe"), Person("Abe"), Person("Jon"))
}

fun main(args: Array<String>) {

    val meetings = listOf(Meetings(4, "Welcome"), Meetings(5, "Debrief "))

    // this actually returns a list of list of persons
    // people inside meetings is a list of people
    // map returns a list, so you get a list of list
    val people = meetings.map { it -> it.people }

    // flatmap flattens collections of collections to a single collection

    // note distinct relies on hashcodes and values, so must refer to a data class
    val distinctPeople : List<Person> = meetings.flatMap { it -> it.people }.distinct()
}