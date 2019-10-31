package com.basics.foxtrot

import com.basics.echo.Meeting

class KeyValue(val key: String, val value: String){}

fun main(args: Array<String>) {
    val listOfInts = listOf(1, 2, 3, 4, 5, 6)

    // filter is a predicate, a boolean in itself
    // if filter is satisfied, it'll add return true and add the required element to a given results set
    // if not, it'll return false and return nothing
    // this results in a filtered list

    // it is used as the
    // if the parameter of the lambda satisfies the predicate, it's added to a new collection
    val smallInts = listOfInts.filter { it < 4 }
    println("Small Ints : $smallInts")

    // each component is the transformed to a new collection
    val squaredInts = listOfInts.map { it * it }
    println("Squared ints : $squaredInts")

    val largeSquaredInts = listOfInts.map { it * it }.filter { it > 10 }
    println("Squared larger Ints : $squaredInts")

    val keyVals  = listOf(KeyValue("Hi", "There"), KeyValue("Hello", "Goodbye"), KeyValue("Mac", "Cheese"))

    val keys = keyVals.map { k -> k.key }
    println("List of keys : $keys")

    // other predeicates include all, any, count and find

}

