package com.example.testdemo

fun main(){
    var a:Int = 23
    var b:Int = 30
    var x:Int = hello(a,b) //arguments
    display(x)
}

fun hello(a:Int, b:Int) : Int{ //prarameters
    //body/Statments
    //var c:Int = a+b
    //return c
    return a+b;
}

fun display(c:Int){
    print("Result : $c")
}

