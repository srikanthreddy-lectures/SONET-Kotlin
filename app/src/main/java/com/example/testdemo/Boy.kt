package com.example.testdemo

class Boy : Person2() {
    override fun displayAge(age:Int){
        super.displayAge(age)
        println("My fake age is ${age-5}")
    }

   //Overloading
    fun m1(){
        println("In m1")
    }

    fun m1(age:Int){
        println("In m1_age")
    }

    fun m1(age:Int,name:String){
        println("In m1_age_name")
    }
}