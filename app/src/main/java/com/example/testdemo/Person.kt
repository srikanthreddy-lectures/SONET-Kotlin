package com.example.testdemo

class Person(var name:String, var weightLbs:Double) {
   var weightKilo:Double
   get() = weightLbs/2.0
    set(value) {
        weightLbs =  value*2.0
    }

    fun eatSweet(addIcescream:Boolean){
        weightLbs += if(addIcescream) 4.0 else 2.0
    }

    fun calGoal(weightToLoos:Double):Double{
        return weightLbs - weightToLoos
    }
}
