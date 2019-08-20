package com.example.learnkotlin2x

var name:String?=null //global

fun add(number1:Int,number2:Int): Int {
    return number1+number2
}

fun add(number1: Int,number2: Int,number3:Int):Int{
    return number1+number2+number3
}

fun add(number1: Int,number2: Int,number3: Int,number4:Int):Int{
    return number1+number2+number3
}

fun showInfo(cardId:Int){

    print("CardID:${cardId}")
}

fun showInfo(name:String){
    print("Name:$name")
}

fun main(){

    showInfo("Hussein Alrubaye")
    showInfo(7211312)

    for(i in 1..20){
        val age=22
    }



}

