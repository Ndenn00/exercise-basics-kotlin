package com.basics.charlie

// provides equals, hashCode and toString
// provides copy method out of the box - can change params in the instantiation nicely
// try to keep fields as val for immutability

data class Human(val id: Int, val name: String, val age: Int = 30) {

}

fun main(args: Array<String>) {
    var kevin = Human(1, "Kev")
    var robert = Human(1, "Kev")

    // == calls down to .equals()
    // kotlin compares all the variables in the class
    if (kevin == robert) {
        println("Equal")
    } else {
        println("Not Equal")
    }

    // with toString on data class, we get the string rep of the class, not hashcode
    println(kevin.toString())

    val alfred = kevin.copy(id = 9, name = "Alfred", age = 44)
    println(alfred.toString())

}
