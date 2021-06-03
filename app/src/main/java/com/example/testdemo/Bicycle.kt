package com.example.testdemo

class Bicycle {
    var brandName:String = ""
    //getter
    get(){
        return field
    }
    //setter
    set(value) {
        field = value.toUpperCase()
    }

    var modelYear:Int = 0
        //getter
        get(){
            return field
        }
        //setter
        set(value) {
            if(value>1990) {
                field = value
            }
            else{
                println("Model Not in production")
                //throw Exception("Model Not in production")
            }
        }

    fun display(){
        println("$brandName -> $modelYear")
    }
}