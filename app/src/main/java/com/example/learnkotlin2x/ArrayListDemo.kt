package com.example.learnkotlin2x

import java.util.ArrayList

fun main(){



    val maxSize = readLine()!!.toInt()

    val listOfPets =ArrayList<String>()

    for(i in 0 until maxSize){
        println("Enter Pet name $i")
        var listOfPets = ArrayList<String>()
    }

    for(i in 0 until maxSize){
        println("Enter pet name $i")
        listOfPets.add(readLine()!!.toString())
    }

    for(i in 0 until  listOfPets.size){
        println("Pet $i: ${listOfPets}")
    }

    for(i in 0 until  listOfPets.size){
        println("Pet $i${listOfPets[i]}")
    }

    if(listOfPets.contains("cat")){

    }




}