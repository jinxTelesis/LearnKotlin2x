package com.example.learnkotlin2x

fun main(){

    val foodID = readLine()!!.toInt()

    when(foodID){

        1 -> {
            println("You got Sandwitch")
        }

        10 ->{

            println(" You got burger")
        }

        else ->{
            println("You did not order anything")
        }
    }

    val grade = readLine()!!.toInt()

    when{
        grade>= 90 ->println("A")
        grade in 80..89 -> println("B")
        grade in 70..79 -> println("C")
    }


}