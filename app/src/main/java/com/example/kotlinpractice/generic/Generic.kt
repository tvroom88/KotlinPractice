package com.example.kotlinpractice.generic

/**
 * 제네릭은 컴파일 시점에 해당 타입을 확정짓지 않고, 런타임 시점으로 유예시킨다.
 * 이로 인해 좀더 다양한 타입을 받아들일 수 있는 기능을 제공하여 타입에 대해 유연한 활용이 가능하다.
 */
class Generic {

    val list : List<String> = mutableListOf()
}