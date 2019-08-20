package com.example.learnkotlin2x

class Car(var type:String,var model:Int,val price:Double,
          val milesDrive:Int,val owner:String){

    init{
        println("yo yo yo")
    }


    fun getCarPrice():Double{
        val priceTotal = this.price-(milesDrive.toDouble()*10)
        return priceTotal
    }

    fun setType(){

    }



}

fun main(){

    val car = Car("BMW",2015,1000.0,105,"Hussein Alrubaybe")


    println(car.type)
    println(car.owner)
    println(car.milesDrive)
    println(car.model)
    println(car.price)
    println(car.getCarPrice())

    val listOfCar = arrayListOf<Car>()
    listOfCar.add(Car("BMW",2015,1000.0,105,"Hussein Alrubaybe"))
    listOfCar.add(Car("BMW",2015,1000.0,105,"Hussein Alrubaybe"))
    listOfCar.add(Car("BMW",2015,1000.0,105,"Hussein Alrubaybe"))

    for(car in listOfCar){
        println("--------")
        println(car.owner)
        print(car.getCarPrice())


    }



}