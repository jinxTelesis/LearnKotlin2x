package com.example.learnkotlin2x

fun main(){

    var list= listOf<String>("Jena","lava")
    for(name in list){
        println(name)
    }

    var list2:MutableList<String> = mutableListOf("Jena","lava")

    for(name:String in list){
        println(name)
    }

    var listOfUsersI = mapOf(1 to "hussin",2 to "jenna")

    var listofUserM = mutableMapOf(1 to "Moe", 1 to "jimmy")



}