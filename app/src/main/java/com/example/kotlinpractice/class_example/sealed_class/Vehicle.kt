package com.example.kotlinpractice.class_example.sealed_class

/**
 * sealed class는 다른 class는 상속을 못하게 제한하고, sealed class 내부에 클래스만 상속가능하게 해서 유한하게 상속하는 개념이다.
 *
 * sealed class의 장점은
 * (1) 코드 안정성
 * (2) 가독성 강화
 * (3) 패턴 매칭에서의 간추림 및 편의성 등이 있다.
 * 
 */
fun main() {

    val car1 = Vehicle.Car("Car", "car")
    val truck1 = Vehicle.Truck("Truck", "truck")

    val vehicleList: MutableList<Vehicle> = mutableListOf()
    vehicleList.add(car1)
    vehicleList.add(truck1)

    for (vehicle in vehicleList) {
        println(vehicle.info)

        when(vehicle){
            is Vehicle.Car -> {
                vehicle.info
            }
            is Vehicle.Truck -> {

            }
        }
    }

    fun printAnimalInfo(vehicle: Vehicle) {
        when (vehicle) {
            is Vehicle.Car -> println("car  :${vehicle.name}.")
            is Vehicle.Truck -> println("truck : ${vehicle.name}.")
        }
    }

    fun printAnimalInfo2(vehicle: Vehicle) {
        vehicle.print()
    }
}

sealed class Vehicle {
    abstract fun print()
    abstract val info: Int

    data class Car(val name: String, val car: String) : Vehicle() {
        override val info: Int
            get() = 1

        override fun print() {
            println("This is a Car named ${name}.")
        }

    }

    data class Truck(val name: String, val truck: String) : Vehicle() {
        override val info: Int
            get() = 2

        override fun print() {
            println("This is a dog named ${name}.")
        }
    }
}