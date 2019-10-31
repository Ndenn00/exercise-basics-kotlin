package com.basics.kilo

import com.basics.java.Meeting

fun main(args: Array<String>){
    val m = Meeting()
    val title : String? = m.meetingTitle()


    // no way of knowing meeting title is valid or null
    // without being set, you'd fire an error at title assignment - ln 7
    // so place @nullable on the Java code declaration and place a nullable string in the declaration
    println(title)

    m.addTitle("Hi")
//    m.addTitle(null) - not null annotation on java side stops this from happening

    // generally you don't have java annotations
    // use platform types
    // kotlin dev has full responsibility for null checking

//    val i : Int = m.titleCanBeNull()
    // hover over the error you'll see needed String! - which is an error from the compiler - a platform type was returned
    //

    // in this case, you can have three types coming from java
    // 1 a string coming across that may not be null
    // 2 a string coming across that may be null
    // 3 a type that kotlin compiler isn't sure of  - a platform type

    // if the value was to come back as null from the java side, you use what you typically would in kotlin
    // coerce etc

    val realTitle = m.titleCanBeNull() ?: "Good title"

}