package com.example.testdemo

class MapDemo {
    public var names = hashMapOf<Int,String>(101 to "Scott",115 to "Mac",23 to "Scott",115 to "Bob")

    public fun displayNames(){
        println(names[101])
        println(names.get(23))

        println("")

        names.put(44,"Ram")
        names.remove(115)
        //names.add("Scott")

        //names.clear()

        for (item in names)
        {
            println("$item")
        }
    }
}

fun main(){
    var demo:MapDemo = MapDemo()
    demo.displayNames()
}