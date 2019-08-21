package com.example.learnkotlin2x

open class ClassConstructor(){ // this is linked to this

    var type:String?=null
    var model:Int?=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null

    constructor(type: String?, model:Int, price:Double, milesDrive:Int, owner:String):this(){
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    constructor(type:String,model:Int):this(){
        this.type = type
        this.model = model
    }
}