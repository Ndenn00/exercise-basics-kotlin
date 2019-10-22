package com.basics.bravo

fun main(args: Array<String>) {
    val h1 = Header("H1")
    val h2 = Header("H2")

    val h3 = h1 plus h2

    println(h3.Name)

    val h4 = h1 + h2

}


class Header(var Name: String) {

}

// infix means no need for dots or brackets
// nice to read is all
// operator means I can use plus symbol instead of the symbol plus
// don't over use this - use it for DSLs only
infix operator fun Header.plus(other: Header): Header {
    return Header(this.Name + other.Name)
}

// you can use