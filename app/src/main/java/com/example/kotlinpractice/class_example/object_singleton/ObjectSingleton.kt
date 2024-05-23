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

object ObjectCounter {
    var count = 0
    fun countUp() {
        count++
    }
}

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

