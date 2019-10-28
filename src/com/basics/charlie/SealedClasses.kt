package com.basics.charlie

//in an abstract sealed class, you define which classes can derive from it

sealed class PersonEvent{
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

// rather than switch statement on an enum, you can use sealed classes
// in this instance, like in Eatin, you have more control and options to switch on

fun handlePersonEvent(event: PersonEvent){
    when(event){
        is PersonEvent.Awake -> println("Is awake .. ")
        is PersonEvent.Asleep -> println("Is asleep .. ")
        is PersonEvent.Eating -> println("Is eating ${event.food}")
    }
}