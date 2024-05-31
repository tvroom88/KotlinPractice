package com.example.kotlinpractice.generic

/**
 *
 */
class Variance {
}

fun main() {

    // ---- 불변성의 예 ---
    val childVariance1: Array<ChildVariance1> = arrayOf(ChildVariance1(), ChildVariance1())

//     Type mismatch. Required: Array<ParentVariance>, Found: Array<ChildVariance1>
//    val parentVariance:Array<ParentVariance> = childVariance1

    // ---- 공변성의 예 ---
    val childVariance2: List<ChildVariance1> = listOf(ChildVariance1(), ChildVariance1())
    val parentVariance: List<ParentVariance> = childVariance2

    val childVariance3: Array<ChildVariance1> = arrayOf(ChildVariance1(), ChildVariance1())
    val parentVariance2: Array<out ParentVariance> = childVariance3


    val parentVariance3: Array<ParentVariance> = arrayOf(ParentVariance(), ParentVariance())
    val childVariance4: Array<in ChildVariance1> = parentVariance3


    // --- 개인 테스트 --

    val sampleList1: List<Int> = listOf(1, 2, 3)
    val sampleList2: List<Number> = sampleList1
}

open class ParentVariance
class ChildVariance1 : ParentVariance()
class ChildVariance2 : ParentVariance()


