package com.example.learnkotlin2x

fun addNumbers(x:Double,y:Double):Double{

    val temp:Double = x + y

    return temp
}

fun displayInfo(vararg name:String){
    for(nam:String in name){

    }
}


fun main(){

    addNumbers(3.0,4.0)

    displayInfo(name = *arrayOf("Jena","Stacy"))


}