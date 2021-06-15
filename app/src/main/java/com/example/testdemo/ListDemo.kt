package com.example.testdemo

class ListDemo {
    public var names = mutableListOf<String>("Scott","Bob","Mac")

    public fun displayNames(){
        println(names[1])
        println(names.get(2))

        println("")

        names.add("Ram")
        names.remove("Bob")

        for (item in names)
        {
            println("$item")
        }
    }
}

fun main(){
    var demo:ListDemo = ListDemo()
    demo.displayNames()
}