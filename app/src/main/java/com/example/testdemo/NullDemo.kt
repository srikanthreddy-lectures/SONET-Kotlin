package com.example.testdemo

fun main(){
    var name:String? = "Scott"
    //name = null;
    var a = name ?: "Guest"
    print("$a")
}