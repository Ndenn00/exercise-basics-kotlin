package com.basics.echo

// revolves around passing a function into a function
// good opportunity to use the strategy pattern


interface Process{
    fun execute(value: Int)
}


class Executor : Process {
    override fun execute(value: Int) {
        println(value)
    }

}

fun main(args: Array<String>){

    println("OO declaration \n")
    var programOO = Program()
    // oo way defines an interface
    // implements the interface
    // .. then passes an implementation in

    // this is you passing in a strategy
    programOO.fib(15, object : Process{
        override fun execute(value: Int) {
           println(value)
        }
    })

    println("\n Functional declaration \n")
    // declaration of functional
    // pass in 8, pass in a lambda that takes a result and prints the result
    // ie, does as per the method definition, takes in an int, returns a void

    var programFunctional = Program()
    programFunctional.fib(8) { n -> print(n)}
    // with only one functional param, the 'it' is used instead of the lambda var
    programFunctional.fib(8){print(it)}
    // also works like this - but intellij complains for style
    programFunctional.fib(8, { x -> println(x)})
    // one more way with double colon - only for one arg
    programFunctional.fib(8, ::println)
}

class Program {

    // oo implementation of the strategy pattern method declaration
    fun fib(limit: Int, action: Process){
        var prev = 0;
        var prevprev = 0
        var current = 1

        for(i: Int in 1..limit){

            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev

        }
    }
    // the dec says pass me an int and pass me a function, called action
    // action takes an int and returns void
    fun fib(limit: Int, action: (Int) -> Unit){
        var prev = 0;
        var prevprev = 0
        var current = 1

        for(i: Int in 1..limit){
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev

        }
    }
}

