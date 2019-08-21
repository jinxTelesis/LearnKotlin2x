package com.example.learnkotlin2x

class SingleTon{

    var name:String?=null

    private constructor(){
        println("instance is created")
    }

    companion object{
        val instance:SingleTon by lazy { SingleTon() }
    }


}

fun main(args:Array<String>){

    var s1=SingleTon.instance
    s1.name="hussein"
    println(s1.name)
    
    var s2=SingleTon.instance
    println(s2.name)

    var s3=SingleTon.instance
    println(s3.name)
}