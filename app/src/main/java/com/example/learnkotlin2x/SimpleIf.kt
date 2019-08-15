package com.example.learnkotlin2x

fun main(){

    val age = readLine()!!.toInt()

    val grade = readLine()!!.toInt()

    if(age> 60){

    }


    if(grade in 80..89) {
        println("B")
    }

    if(grade in 70..79){
        println("C")
    }



}