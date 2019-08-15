package com.example.learnkotlin2x

fun main(){

    var listOfUser = HashMap<Int,String>()

    listOfUser[123] = "Hussin"
    listOfUser[554] = "Jena"
    listOfUser[12] = "Lava"

    println("print ID 123 ${listOfUser[123]}")

    for(key in listOfUser.keys) {
        println("$key ${listOfUser[key]}")
    }







}