package com.basics.foxtrot

fun main(args: Array<String>) {

    // other predeicates include all, any, count and find

    val ints = listOf(1, 2, 3, 4)
    val isAll = ints.all { it > 55 } // returns false
    val anyGreater = ints.any{it > 1} // returns true

    // define a custom predicate

    // the value v, when passed, is assessed whether bigger than three

    val greaterThanThree = { v : Int -> v > 3}

    // then pass in the custom predicate to a predicate method

    val isBiggerThanThree = ints.any(greaterThanThree)
    val qtyBiggerThanThree = ints.count(greaterThanThree)
    println(isBiggerThanThree)
    println(qtyBiggerThanThree)

    // returns the first element that satisfies the predicate
    // if nothing is found, null is returned
    val numberBiggerThanThree = ints.find(greaterThanThree)


}