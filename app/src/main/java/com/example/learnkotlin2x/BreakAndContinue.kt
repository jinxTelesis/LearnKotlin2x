package com.example.learnkotlin2x

fun main(){

    for(number in 1..10){
        println(number)
    }

    loop@ for(number in 1..10){
        println("number: $number")
        for(innerLoop in 1..7){
            println("innerLoop: $innerLoop")
            if(innerLoop==6){
                break@loop
            }
        }
    }
}