package com.basics.charlie


//set time with time param NialTime has default implementation to stop breaking code using the interface
interface Time{
    fun setTime(hours: Int, mins:Int = 0, secs: Int = 0)
    fun setTime(time: NialTime) = setTime(time.hrs)
}

interface EndOfTheWorld{
    fun setTime(time: NialTime){}
}

class NialTime{
    var hrs: Int = 0
    var mins: Int = 0
    var secs: Int = 0
}

// colon time means implementing
//by default all classes, functions etc are public by default
class YetiTime : Time, EndOfTheWorld {

    // override keyword replaces the annotation
    override fun setTime(hours: Int, mins: Int, secs: Int) {

    }

    override fun setTime(time: NialTime) {
        //you can pass in the time given as a param and call one, or both of the super types
        // as both call in the same param and conflict
        super<EndOfTheWorld>.setTime(time)
        super<Time>.setTime(time)
    }

}

