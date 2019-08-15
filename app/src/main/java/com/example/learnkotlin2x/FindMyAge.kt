package com.example.learnkotlin2x

import java.util.*

fun main(){


    println("Enter DOB: ")
    val yearOfBirth = readLine()!!.toInt()


    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age = 2019 - yearOfBirth

    print("You are $age years old")


}