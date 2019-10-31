package com.basics.india

import com.basics.echo.Meeting

fun main(args: Array<String>) {
    // assign a regular object
    val m: Meetings = Meetings()

    // this is type nullable meeting
    var p: Meetings? = null

    var newMeeting = Meetings()
    // this can't be done due to different types - nullable vs non nullable
//    newMeeting = p

    // okay
    closeMeeting(newMeeting)
    // type mismatch
//    closeMeeting(p)
    // to get around this, see fun nullableCloseMeeting
    nullableCloseMeeting(p)
    // assert not null for more clarity - avoid if you can
    notNullCloseMeeting(p)

    // coalescing
    // if it is null, create a nice new object that is safe
    newMeeting = p ?: Meetings()


    // this won't work typically
    var nullMeeting:Meetings? =  null
//    closeMeetingNonNull(nullMeeting)

    // this only runs if m is not null
    // this allows explicit not null check using lambdas
    nullMeeting?.let {
        closeMeetingNonNull(nullMeeting)
    }
}

fun closeMeeting(m: Meetings): Boolean? {
    return if (m.canClose) m.close()
    else false
}

fun nullableCloseMeeting(m: Meetings?): Boolean? {
    // instead of a null check, you need to assert the type of m
    // m.canClose can be true, false or null, so assert if m?.canClose is true only
    return if (m?.canClose == true) m?.close()
    else false

}

fun notNullCloseMeeting(m: Meetings?): Boolean {

    return if (m!!.canClose) m.close()
    else false
}

fun closeMeetingNonNull(m: Meetings): Boolean{
    return if(m.canClose == true) m.close()
        else false
}

interface ISavable{
    fun save()
}

class Meetings {
    val canClose: Boolean = false
    lateinit var address: Address

    fun close(): Boolean {
        return false
    }

    fun save(o: Any){
        // contrived example
        // cast o to typeISavable
        val safeSavable = o as? ISavable
        // save won't be called unless safeSavable isn't of type savable
        safeSavable?.save()
    }

    fun init(add: Address){
        this.address = add
    }
}

// late init, when you have to delay the init
// you're on the hook for the init though, because it's needed before use
class Address{

}

