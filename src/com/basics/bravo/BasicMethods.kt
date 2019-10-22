@file:JvmName("NiceJavaName")
package com.basics.bravo

fun main(args: Array<String>) {
    display("Hi")
    println(max(1, 2))
    log("Hi");
    namedParameters()
}

// basic declaration
fun display(message: String): Boolean {
    println(message)
    return true
}

fun displayTheMessage(message: String) : String{
    return message
}

// function expressions
fun max(a: Int, b: Int): Int = if (a > b) a else b

// default params, log level set to 1 by default
// overloads allow you to call it as expected in java
@JvmOverloads
fun log(message: String, logLevel: Int = 1): String{
    return "$message $logLevel"
}

// named parameter
// calling the name parameter only at point of calling

fun namedParameters(){
    println(log(logLevel =  45, message = "Yo"))
}

