package com.basics.bravo

// extension functions
// like statics, only cut down on utility classes - just no need for its own class
// 1 functions are extension functions in their own right
// 2 the function is much easier to read


fun replaceMultipleWhiteSpace(value: String) :String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

// we can extend String class instead of having a string utils class
// this, is the receiver, which is the passed in item that the String class would pass in

fun String.replaceMultipleWhiteSpaceExtension() :String{
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

fun main(args: Array<String>){
    val text = "multiple whitespace      hi"
    println(replaceMultipleWhiteSpace(text))
    println(text.replaceMultipleWhiteSpaceExtension())
}