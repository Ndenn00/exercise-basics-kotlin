package com.basics.echo

import java.util.*

// like keywords, but are standard methods whose last parameters are lamdas

class Meeting{
    fun create() {
        println("Created!")
    }

    var title: String = ""
    var time: Date = Date()
    var who = mutableListOf<String>()
}

fun main(args: Array<String>){
    // before using when
    val meeting = Meeting()
    meeting.title = "Board Meeting"
    meeting.time = Date(24, 7, 2019)
    meeting.who.add("Kev")

    // you can do this with a nice with statement as a builder
    // the code within the braces is a lambda, you're assigning on the
    val meetingTwo = Meeting()
    with(meetingTwo){
        title = "Board Meeting"
        time = Date(24, 7, 2019)
        who.add("Kev")
    }

    // apply is similar, but you can do initialization on the object as well as instantiate
    // or some other type of method call

    meetingTwo.apply {
        title = "Board Meeting"
        time = Date(24, 7, 2019)
        who.add("Kev")
    }.create()
}
