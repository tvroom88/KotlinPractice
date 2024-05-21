package com.example.kotlinpractice.class_example.abstract_class

abstract class AbstractAnimal(val age: Int = 3, val name: String) {

    abstract fun test1()
    open fun test2() {
        print("AbstractAnimal - open function")
    }
}

class AbstractRabbit : AbstractAnimal(23, "Rabbit") {
    override fun test1() {
        print("AbstractRabbit - abstract function")
    }

    override fun test2() {
        print("AbstractRabbit - open function")
    }
}

interface InterfaceAnimal {
    val age: Int
    fun one(): String
    fun two(): String {
        return "two"
    }
}


interface InterfaceAnimalB

class AbstractTiger(override val age: Int) : InterfaceAnimal, InterfaceAnimalB {
    override fun one(): String {
        TODO("Not yet implemented")
    }
}

