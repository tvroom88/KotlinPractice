package com.example.kotlinpractice.class_example.data_class

/**
 * Data Class 는 일반 class에서 자주 사용되는 메소드들을 자동으로 만들어준다.
 *
 * (1) hashCode()
 * (2) copy()
 * (3) equals()
 * (4) toString()
 * (5) componentsN()
 */
fun main(){
    val p1 = Person(30,"JJJ")
    val p2 = Person(30,"JJJ")

    // 내용이 같은지 검사
    println(p1==p2)

    // 같은 인스턴스인지 검사 (즉, 메모리가 같은 위치인지 검사)
    println(p1===p2)
    println(p1.toString())

    val p3 = Person2(30, "JJJ")
    println(p3.toString())

}

data class Person(val age: Int, val name: String)
class Person2(val age: Int, val name: String)