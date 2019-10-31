package com.basics.golf

// use when lists are massive
// sequences for dealing with lazy evaluation
// no extra memory used, or no evaluation done until it's asked
//


class Person(val name: String)

fun iter(seq: Sequence<String>){
    for(s in seq) println(s)
}

data class Meetings(val id: Int, val title: String) {
    val people = listOf(Person("Joe"), Person("Abe"), Person("Jon"))
}

fun main(args: Array<String>): Unit {

    val meetings = listOf(Meetings(4, "Welcome"), Meetings(5, "Debrief "))

    val titles = meetings
            .asSequence()
            .filter { it -> it.title.startsWith("W") }
            .map { m -> m.title }

    // with sequence, at this point, nothing happens until you ask at the end for something to happen
    // terminal operations need to be placed at teh end of terminal

    for (t in titles) println(t)

    // without sequence you map the first, map 2nd, map n, then filter, then print

    val moreTitles = meetings
            .map{ println("Map: $it"); it.title.toUpperCase() }
            .filter{it.startsWith("W")}
    println(moreTitles)

    // with sequence, you map the first then find it then print.
    // when it finds the first, the process is terminated
    // much more efficient
    val moreTitlesAsSequence = meetings
            .asSequence()
            .map{ println("Map: $it"); it.title.toUpperCase() }
            .find{it.startsWith("W")}
    println(moreTitles)

    val lazyTitles: Sequence<String> = meetings
            .asSequence()
            .map{ println("Map: $it"); it.title.toUpperCase() }

    // passing lazyTitles in to the iter method is efficient, as lazyTitles isn't evaluated until the method is called
    // only evaluated when needed
    iter(lazyTitles)

}