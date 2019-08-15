package com.example.learnkotlin2x


fun main(){

    val isMarried = true
    val GPA = 3.8

    val isQualified = if (isMarried && GPA>3.8) 1 else 0

    val isGood = when(GPA){
        4.0 -> true
        else -> false


    }

    println(isGood)




}


class ExpressionCondition {
}