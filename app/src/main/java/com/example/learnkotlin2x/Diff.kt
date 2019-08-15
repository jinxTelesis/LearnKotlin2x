package com.example.learnkotlin2x

fun main(){


    val pet1 = readLine()!!.toString()
    val pet2 = readLine()!!.toString()
    val pet3 = readLine()!!.toString()

    println("pet1; $pet1")
    println("pet2: $pet2")
    println("pet3: $pet3")

    var listOfPets:Array<String> = Array(3){""}

    for(i in 0..2){
        listOfPets[i] = readLine()!!.toString()
    }

    for(i in 0..2){
        println("Pet $i: ${listOfPets[i]}")
    }

    val maxSize = 5

    var listOfPets2:Array<String> = Array(maxSize){""}

    for(i in 0..maxSize-1){
        listOfPets[i] = readLine()!!.toString()
    }

    for(i in 0..maxSize){
        println("Pet $i ${listOfPets[i]}")
    }




}