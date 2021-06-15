package com.example.testdemo

open class A{
    public var a:Int = 10
    private var b:Int = 20
    protected open var c:Int = 30
    internal var d:Int = 40

    open fun display(){
        println("A class variable $a")
        println("A class variable $b")
        println("A class variable $c")
    }

    protected fun test(){
        println("Hello")
    }

}

class EncapsulationDemo : A() {
    override var c = 100

    override fun display(){
        super.display()
        println("EncapsulationDemo class variable ${a}")
        println("EncapsulationDemo class variable ${c}")
        test()
    }

}

fun main(){
    var en:EncapsulationDemo= EncapsulationDemo()
    en.display()
    //println(en.c)  // ERROR because c is protected
    //en.test()
}