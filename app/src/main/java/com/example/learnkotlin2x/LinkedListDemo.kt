package com.example.learnkotlin2x

import java.util.*

fun main(){

    var listOfPets = LinkedList<String>()
    var listOfMonkey = LinkedList<String>()
    var listOfStankes = LinkedList<String>()
    var listOfCats = LinkedList<Int>()
    var listOfDogs = LinkedList<Double>()
    

    do{
        val petName = readLine()!!.toString()
        if(petName != "quit"){
            listOfPets.add(petName)
        }


    } while(petName!="quit")


    for(i in 0 until  listOfPets.size){
        println("Pet $i ${listOfPets[i]}")
    }

    for(pet in listOfPets){
        println("Pet: $pet")
    }


}