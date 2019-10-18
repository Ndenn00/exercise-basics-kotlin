package com.basics.alpha

import java.util.*

fun main(args: Array<String>) {

    // iteration - do and when are the same
    var index = 0

    do {
        index++
    } while (index < 10)

    index = 0

    while (index < 3) {
        println("Hi")
        index++
    }

    // for is different
    // ranges are inclusive
    var myRange = 1..10

    for (i in 1..5) {
        println("My number is $i")
    }

    for (i in 1..20 step 2) {
        println("My number is $i")
    }

    for (i in 10 downTo 1 step 2) {
        println("My number is $i")
    }

    // half closed ranges
    for (i in 1 until 5) {
        println("My half closed range number is $i")
    }

    // useful over maps
    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Bob"] = 44
    ages["Aaron"] = 33
    ages["Larry"] = 22

    for ((name, age) in ages) {
        println("$name age: $age")
    }

    var numbers = 1..10

    // to get access to an index
    for ((index, element) in numbers.withIndex()){
        println("$element at $index")
    }

    // you can range anything that implements the comparable interface
    var differentRange = 'a'..'z'

}