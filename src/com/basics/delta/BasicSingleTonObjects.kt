package com.basics.delta


class Course(val id : Int, val title: String){

}
// objects can be defined inside a class to limit scope of the object

// note singletons are seen as an anti-pattern
// as in cryptonite to testing
object Courses{
 var allCourses = arrayListOf<Course>()

    // needs called, not a constructor
    fun initialize(){
        allCourses.add(Course(1, "Hi"))
    }
}