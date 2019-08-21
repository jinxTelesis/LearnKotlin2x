package com.example.learnkotlin2x

class Outer{

    private val name:String?=null

    class Nested{

        fun show(){
            println("nested")
        }
    }
}

class Other{

    private val name:String?=null

    class PowerSource{
        fun show(){
            println("yeah!")
        }
    }
}

fun main(args:Array<String>){

    var outer=Outer()
    var nested=Outer.Nested()

    nested.show()
}