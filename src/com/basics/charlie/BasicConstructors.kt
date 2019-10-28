package com.basics.charlie

//these vals in constructors are 'constructor params'
open class OtherPerson(val name: String, var age: Int = 33){
}

// alternative constructors exist, but are not preferred - init and _vals

// secondary constructors use the constructor keyword
// instead of using these, just use default parameters

// superclass constructors
// first way passes name to inherited constructor in its constructor
// second type does it old fashioned

class OtherStudent(name: String ) : OtherPerson(name){}

class AnotherStudent: OtherPerson {
  constructor(name: String) : super(name)
}

// init always run on instantiation, so val in constructor doesn't need initialised
class OneMoreStudent(firsName: String, lastName: String, _id: Int) : Person(firsName, lastName){
    val id : Int
    var tutor: String
    init{
        id = _id
        tutor = ""
    }

    // secondary constructor, passes params to 'this' initial constructor

    constructor (firstName: String, lastName: String, _id: Int, tutor: String) :this (firstName, lastName, _id){
        this.tutor = tutor
    }

    override fun getAddress(): String {
        return "Hi"
    }

}

fun main(args: Array<String>) {
    val student = OtherStudent("Simon")
    println("Age of ${student.name} is ${student.age} years old")
    println("A year passes .. ")
    ++student.age
    println("Age of ${student.name} is ${student.age} years old")

    val kevin = OneMoreStudent("John", "Berry",44)
    val james = OneMoreStudent("Ellen", "Perry", 6, "Oliver Apple")

}


// private constructors and factory objects exist, but a little better than javas implementation
