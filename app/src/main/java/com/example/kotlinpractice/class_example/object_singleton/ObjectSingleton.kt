package com.example.kotlinpractice.class_example.object_singleton


fun main() {
    println("1. ${ObjectCounter.count}")
    ObjectCounter.countUp()
    ObjectCounter.countUp()
    println("2. ${ObjectCounter.count}")

    val objectFoodPollA = ObjectFoodPoll("치킨")
    val objectFoodPollB = ObjectFoodPoll("피자")

    objectFoodPollA.vote()
    objectFoodPollA.vote()

    objectFoodPollB.vote()
    objectFoodPollB.vote()
    objectFoodPollB.vote()

    println("${objectFoodPollA.name} : ${objectFoodPollA.count} / ${ObjectFoodPoll.total}")
    println("${objectFoodPollB.name} : ${objectFoodPollB.count} / ${ObjectFoodPoll.total}")

}

// 1. 객체 선언(Object Declaration)
object ObjectCounter {
    var count = 0
    fun countUp() {
        count++
    }
}

// 2. 동반 객체 (Companion Object)
class ObjectFoodPoll(val name: String) {
    companion object {
        var total = 0
    }

    var count = 0
    fun vote() {
        total++
        count++
    }
}

//3. 객체 표현식 (Object Expression)
// 참고 url : https://rnathsus.tistory.com/335
class ObjectExpression() {

    // 처음부터 익명 객체 생성하기
    // 객체 표현식의 시작은 object 키워드로 시작합니다. 부모 타입을 가지지 않는 단순 익명 객체를 만들고자 한다면, 아래 코드와 같이 작성합니다.
    val helloKO = object {
        val message = "안녕"
        override fun toString(): String {
            return message
        }
    }

    // 부모 타입으로 부터 상속 받는 익명 객체 생성하기
    // 익명 객체가 상속을 받는다고 생각하면 된다.
    val helloEn = object : SayHi() {
        override fun toString(): String {
            return message
        }
    }

    // 만약에 부모의 생성자를 가지고 있으면, 적절한 생성자 파라미터를 넘겨줄 수 있습니다.
}

open class SayHi {
    open val message = "hello"
}

