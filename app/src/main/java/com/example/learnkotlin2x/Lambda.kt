package com.example.learnkotlin2x

fun sum(number1:Int,number2:Int):Int{
    return number1 + number2
}

val sum = {number1:Int,number2: Int -> number1 + number2}
val sum1 = {number1:Int,number2: Int -> number1 + number2}

val sum2 = {number1:Int,number2:Int,number3:Int -> number1 + number2 + number3}

val sum5 = {double1:Double,double2:Double -> double1 + double1}

val times1 ={double1:Double,double2:Double -> double1 * double2}

fun main(){

    val addNumbers = sum(3,4)
    print(addNumbers)

    val listOfNumbers = listOf(10,15,22,34,80)

    for(number in listOfNumbers){
        println(number)
    }

    listOfNumbers.forEach{number -> println(number)}
    listOfNumbers.forEach{blah -> println(blah)}
    listOfNumbers.forEach{Beep -> println(Beep)}

    listOfNumbers.forEach { x -> x * x  }
    listOfNumbers.forEach { y -> y * y }

    listOfNumbers.forEach { x -> x * x * x }




}
