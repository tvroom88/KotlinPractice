package com.example.kotlinpractice.constructure


fun main() {
    val constructorExample = ConstructorExample()
    val constructorExample2 = ConstructorExample2()
}

/**
 *  --- 생성자 설명 ---
 *
 * - 1) 주생성자 :  class 이름 뒤에 붙는 생성자를 주생성자라고 한다. (constructor 키워드 생략 가능)
 * - 2) 부생성자 : class 내부의 constructor와 함께 쓰이는 생성자를 부생성자라고 한다.
 * - 3) init() : 주생성자에 경우 내부에 수행 하는 기능이 없기 때문에 init을 통해서 다른 것들을 수행하기 전의 기능을 수행가능하다.
 */

/**
 * function 실행 결과 :
 *
 * init - Tom
 * constructor3
 * constructor2
 * constructor1
 *
 * 부생성자가 실행되기 전에 init이 실행된다. 
 */
class ConstructorExample (private val name: String, val age: Int, val money: Int = 1) {
    init {
        println("init - $name")
    }
    constructor() : this("Tom") {
        println("constructor1")
    }
    constructor(name: String) : this(name, 11) {
        println("constructor2")
    }
    constructor(name: String, age: Int) : this(name, age, 10000){
        println("constructor3")
    }
}


class ConstructorExample2 {
    constructor(){
        println("constructor1")
    }
    constructor(name: String) {
        println("constructor2")
    }
}

