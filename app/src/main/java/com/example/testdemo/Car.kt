package com.example.testdemo

class Car : Vehicle() {
    override var name:String="Ford"
    override var mediumOfTravel:String="Land"
    override var wheels:Int = 4

     override fun display() {
        println("The $name has $wheels and runs on $mediumOfTravel")
    }

    fun m1(){
        println("Hello")
    }
}