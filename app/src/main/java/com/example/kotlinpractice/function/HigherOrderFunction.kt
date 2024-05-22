package com.example.kotlinpractice.function

/**
 * 고차함수란:
 * >>> 함수를 마치 클래스에서 만들어 낸 인스턴스처럼 취급하는 방법
 * 함수를 패러미터로 넘겨 줄 수도 있고
 * 결과 값으로 반환 받을 수도 있는 방법
 *
 * 코틀린에서는 모든 함수를 고차함수로 사용 가능하다.
 *
 *
 */
fun main() {

    // (자료형, 자료형, ...) -> 자료형

    // 1. 코틀린의 타입 추론으로 인해 변수 타입을 지정하지 않아도 람다를 변수에 대입할 수 있다.
    val sum1 = { a: Int, b: Int -> a + b }
    println("1 : sum ${sum1(2, 3)}") // 1 : sum 5

    // 2. 미리 타입을 추론한다면 아래와 같이 사용 가능하다
    val sum2: (Int, Int) -> Int = { a, b -> a + b }
    println("2 : sum ${sum2(4, 6)}") // 2 : sum 10

    // 3. 함수 타입을 선언할떄 Unit을 생략할수 없다.
    val sum3 = { a: Int, b: Int -> println("${a+b}") }
    val sum4: (Int, Int) -> Unit = { a, b -> println("${a+b}")}

    // 4. 고차함수를 인자(parameter)로 넘기기
    val higherFun:(String) -> Unit = {str:String -> println(str)}
    highOrderFunctionA(higherFun)

    // 5. 일반함수 고차함수로 넘기기
    highOrderFunctionA(::normalFunction)

}

fun normalFunction(name: String) {
    println("my name is $name")
}

// 고차함수 =  이름 : (고차함수 인자 타입) -> 반환타입
fun highOrderFunctionA(function: (String) -> Unit) {
    function("B")
}

