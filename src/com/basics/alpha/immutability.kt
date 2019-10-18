package com.basics.alpha

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    var q = Question()
    // mutable type, q is inferred as type question
    var p: Question = Question()

    val r = Question()
    // make as many things as possible immutable

    q.answer = "Forty Two"
    // q.question = "different answer" - this won't work

    // using bound interpolation on compound variables
    println("The answer is this ${q.answer}")

    var message: String
    if (q.answer == q.correctAnswer) {
        message = "Yes they are equal"
    } else {
        message = "No they are not correct"
    }
    println(message)

    // if as an expression - can be used as immutable
    val betterMessage = if (q.answer == q.correctAnswer) {
        "You're correct"
    } else {
        "Not correct at all"
    }

    // dealing with nulls - null cannot be the value of a non null type (String in this case)
    // can't make something null unless you explicitly tell the compiler

    // val s:Question? = Question()

    val s: Question? = null
    // val s is of a nullable type Question - that is, it may or may not be null
    // use the safe operator - if s is not null, then perform the operation
    s?.answer = "new answer"
    s?.display()
    s?.nullAnswer

    q.printResult()

    // parsing throws exceptions in java, here you work differently -
    // include a try block in assignment and give a default return value on catch
    // the type can also be set to null
    val number: Int? = try {
        Integer.parseInt(q.answer)
    } catch (e: NumberFormatException) {
        null
    }
    println("number is $number")




}

class Question {
    var answer: String = ""
    var nullAnswer: String? = null
    val question: String = "What is the answer"
    val correctAnswer = "42"

    fun display() {
        println("You said " + answer)
    }

    fun displayUsingInterpolation() {
        println("You said $answer")
    }

    // whens are like switches
    fun printResult() {
        when (answer) {
            correctAnswer -> println("You're correct")
            else -> println("try it again")
        }
    }

}