package com.basics.echo

// kotlin lambdas can mutate values
// this doesn't work in java, as it'd have to be final variable to sum the total

fun main(args: Array<String>){

    var program = Program()
    var total = 0;

    program.fib(8){it -> total+= it}
    println("Total is $total")

}

