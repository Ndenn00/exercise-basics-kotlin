package com.basics.hotel

import com.basics.java.Created
import com.basics.java.User

fun main(args: Array<String>){

    var user = User("Kev")


    // kotlin lambda has been changed to a java anonymous object
    // under the covers, you're creating an object calling create on the object, you're only passing in the object once
    // rather than asking for a lambda, kotlin knows you need something of type Created for the create method
    // this is automatically done for you
    user.create{ println("User $it has been created ")}

    user.create{ println("User $it has been created ")}



    var count = 0

    var newUser = User("Eugene")

    // when you close over the count var and capture state, a new instance is called each time the create
    newUser.create{println("User $it has been created a total of ${++count} times ")}
    newUser.create{println("User $it has been created a total of ${++count} times ")}

    // consider

//    var eventListener = {println("User $it has been created a total of ${++count} times ")}
//    user.create(eventListener)
    // this won't work as created takes a Created type, and you're passing in a function that takes no param and returns unit
    // previously you were saying you were taking a user and returning unit
    // kotlin doesn't know what 'it' is

    // sam constructor, to give the correct type

    user.create( Created { run { println("User $it has been created a total of ${++count} times ") } })


}