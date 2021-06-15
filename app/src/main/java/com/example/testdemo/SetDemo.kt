package com.example.testdemo

class SetDemo {
    public var names = hashSetOf<String>("Scott","Mac","Scott","Bob")

    public fun displayNames(){
        //println(names[1])
        //println(names.get(2))

        println("")

        names.add("Ram")
        names.remove("Bob")
        names.add("Scott")

        //names.clear()

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