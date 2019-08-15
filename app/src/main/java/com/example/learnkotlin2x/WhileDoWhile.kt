package com.example.learnkotlin2x

fun main(){


    for(i in 1..10 step 1){
        println("Counter $i")
    }

    var petName:String = "Cat"

    if(petName.contains("cat")){
        println("we have a cat!")
    }
}