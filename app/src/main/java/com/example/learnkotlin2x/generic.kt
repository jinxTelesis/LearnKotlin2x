package com.example.learnkotlin2x

class UserAdmin<T>(credit:T){

    init{
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}

fun main(args:Array<String>){

    var userAdmin=UserAdmin<String>("hussein")
    var userAdmin2=UserAdmin<Int>(1231)
    var userAdmin3 = UserAdmin<Double>(1213.1)



}