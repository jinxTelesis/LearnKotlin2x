package com.example.learnkotlin2x

fun main(){

    val age = readLine()!!.toInt()

    val grade = readLine()!!.toInt()

    if(age > 18){
        println("you could apply for the job")
    } else{
        println("You can not apply for the job")
    }





    if(grade>=90){
        println("A")
    } else if(grade in 80..89){
        println("B")
    } else if(grade in 70..89){
        println("Fail")
    }






}