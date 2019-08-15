package com.example.learnkotlin2x

fun main(){

    val message=" Welcome to new York?"

    val name = "Hussein"

    val allMessage = "$name,$message"

    print(allMessage)
    print(allMessage.toLowerCase())
    print(allMessage.toUpperCase())
    print(message.trim())

    val tokens:List<String> = message.split(" ")
    for(token in tokens){
        println("token: $token")
    }

    for(token in tokens){
        if(!token.contains("to") || !token.contains("is"))
            println("token $token")
    }






}