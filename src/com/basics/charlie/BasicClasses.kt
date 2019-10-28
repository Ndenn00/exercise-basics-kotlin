package com.basics.charlie

// classes are public and final by default
// java classes are open by default.
// you only want to derive by those you've explicitly said you can

// open keyword is needed to derive from both methods and classes

// classes can also be abstract
// abstract functions must be implemented
// open functions can be derived from


abstract class Person(val firstName: String, val lastName: String){


    open fun getName() : String = "$firstName $lastName"

    abstract fun getAddress(): String
}

class Student(firstName: String, lastName: String) : Person(firstName, lastName){
    override fun getAddress(): String {
        return "Address, Hi"
    }

    override fun getName() : String{return "Hi"}

}

// note
// classes also are public as standard
// visibility scoping is not down to package level
// it does have private, and protected, but not package private

