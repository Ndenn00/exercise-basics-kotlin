package com.basics.delta

import com.basics.charlie.Person

class Guy (firstName : String, lastName : String, _id: Int, var tutor : String) : Person(firstName, lastName){
    override fun getAddress(): String {
        return "okay"
    }

    // filters through the singleton object array list and returns what's found or null
    fun enrole (courseName : String){
        val course  = Courses.allCourses.filter{ it.title == courseName }.firstOrNull()
    }

}