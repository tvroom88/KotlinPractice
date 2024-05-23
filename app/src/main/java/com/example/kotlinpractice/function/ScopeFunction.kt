package com.example.kotlinpractice.function

/**
 * Scope Function :
 *
 * apply, run, with, also, let
 */
fun main() {

    //1. apply는 인스턴스를 생성한 후 변수에 담기전에 '초기화 과정'을 수행할때 쓰인다.
    val book1 = ScopeFunctionBook("BookA", 30000).apply {
        name = "초특가 $name"
        discount()
    }

    println(book1)

    val changedBook = book1.apply {
        name = "BookA 개정판"
        discount()
    }


    /**
     * 2. run은 apply처럼 run 스코프 안에서 참조연산자를 사용하지 않아도 된다는 점은 같지만,
     * 알반 람다함수처럼 인스턴스 대신 마지막 구분을 결과값으로 반환한다.
     *
     * 따라서 이미 인스턴스가 만들어진 후에 인스턴스의 함수나 속성을 Scope 내에서 사용해야 할때
     */
    val value = book1.run {
        price
    }

    println("책의 가격 : $value")

    /**
     * 3. with : run과 동일한 기능을 가지지만 단지 인스턴스를 참조연산자 대신 parameter로 받는다는 차이뿐이다.
     */
    val value2 = with(book1){
        price
    }
    println("책의 가격 : $value2")


    /**
     * 4. also, let
     *
     * apply/also : 처리가 끝나면 인스턴스를 반환
     * run/let : 처리가 끝나면 최종값을 반환
     *
     * 각각 apply (-also)와 run (-let)의 기능을 가지고 있다.
     * 하지만 한가지 공통점이 있다.
     * 마치 parameter로 인스턴스를 넘긴것처럼 also와 let은 it을 통해서 인스턴스를 사용할 수 있다.
     *
     * 근데 왜????
     * 같은 이름의 변수나 함수가 scope 바깥에 중복 되어 있는 경우에 혼란을 방지하기 위해서다.
     */

    var price = 5000
    book1.run {
        println("상품명: $name, 가격 ${price}원") // 결과 : 상품명: BookA 개정판, 가격 26000원
    }

    book1.let {
        println("상품명: ${it.name}, 가격 ${it.price}원") // 결과 : 상품명: BookA 개정판, 가격 26000원
    }

    ScopeFunctionBook("BookA", 30000).let {
        println("상품명: ${it.name}, 가격 ${it.price}원")
    }

    val book2 = ScopeFunctionBook("BookA", 30000).also {
        it.name = "초특가 ${it.name}"
        it.discount()
    }

}

data class ScopeFunctionBook(var name: String, var price: Int) {
    fun discount(){
        price -= 2000
    }
}
