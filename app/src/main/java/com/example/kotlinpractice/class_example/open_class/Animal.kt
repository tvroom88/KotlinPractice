package com.example.kotlinpractice.class_example.open_class


/**
 * open class는 상속할 수 있는 class다.
 * 기본적으로 코틀린에서 일반 class는 다 final이기 때문이다.
 */
fun main(){
    var a = Animal("멍멍이", 5)
    var b = Dog("멍멍이", 5)
}

open class Animal(var name:String, var age: Int) {
    open fun introduce(){
        println("Animal : $name $age ")
    }
}

class Dog(name:String, age:Int) : Animal(name, age){
    override fun introduce(){
        println("Dog : $name $age ")
    }
}

// 클래스를 상속하기 위해서는 open을 붙여줘야 한다. 왜냐하면 코틀린에서는 class 가 final 이기 떄문이다.
open class Parent {}
class Child: Parent() {}