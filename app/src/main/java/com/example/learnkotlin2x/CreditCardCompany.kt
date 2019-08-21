package com.example.learnkotlin2x

interface CreditCard{
    val cardNumber:String

    fun score(age:Int)
}

class MasterCard(override val cardNumber:String):CreditCard{


    override fun score(age: Int) {

        if(age>50){
            println("Negative")
        } else{
            println("Postive")
        }
    }
}

class Visa(override val cardNumber:String):CreditCard{

    override fun score(age:Int){
        if(age>60){
            println("Negative")
        } else{
            println("Postive")
        }
    }
}

class PayPal(client:CreditCard):CreditCard by client{}

fun main(){

    val visa = Visa("742612131313")
    visa.score(60)

    val masterCard = MasterCard("2113212121312")
    masterCard.score(60)

    val paypal = PayPal(masterCard)
    println("cardNumber PayPal:${paypal.cardNumber}")



}