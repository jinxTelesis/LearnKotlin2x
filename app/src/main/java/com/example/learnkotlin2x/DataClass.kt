package com.example.learnkotlin2x

data class Person(val name:String,val age:Int,var gender:String){

}

fun main(){

    val person= Person("nuke",1,"female")

}