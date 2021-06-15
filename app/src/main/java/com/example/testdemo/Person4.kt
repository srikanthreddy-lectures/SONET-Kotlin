package com.example.testdemo

fun main(){
    val names = HashMap<Int,String>()
    names.put(1,"Bob")
    names.put(2,"Scott")
    names.put(3,"Mac")

    println("${names[1]}")

    for(name in names){
        println("$name")
    }
}

class Person4(var name:String,var gender:String ) {
    fun display(){
        println("$name is $gender")
    }
}