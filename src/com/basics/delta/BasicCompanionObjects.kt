package com.basics.delta

import com.basics.charlie.Person
import com.basics.charlie.Student

// companions are used as factories best
// hide complex initialzation processes

// they are also used to add static members to a class

// factory methods for different

open class MatureStudent (firstName: String, lastName: String) : Person(firstName, lastName){
    override fun getAddress(): String {
        return "Address, Hi"
    }

    override fun getName() : String{return "Hi"}

    // companion objects also can implement interfaces
    // and derive from other classes
    companion object{
        fun createUndergrad(name: String) : UnderGraduate{
            return UnderGraduate(name)
        }
        fun createPostgrad(name: String) : PostGraduate{
            return PostGraduate(name)
        }

    }



}

class UnderGraduate (firstName: String) : MatureStudent(firstName, "Simmons"){


}

class PostGraduate (firstName: String) : MatureStudent (firstName, "Simmons"){

}

fun main (args: Array<String>){

    // static method called
    val newMatureStudent = MatureStudent.createPostgrad("Alan")

}