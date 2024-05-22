package com.example.kotlinpractice.function

fun main() {

    sum(10, 20)
}

// 일반적인 함수 선언 방식
fun plus(a: Int, b: Int): Int {
    return a + b
}

// 람다 함수 선언 방식
val sum = { a: Int, b: Int -> a + b }

val print = {
    val a = 1
    val b = 3
    a+b
}

val one = { -> println(it)}