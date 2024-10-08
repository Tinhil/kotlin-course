package com.yaumamydurachok.kotlincourse.lesson10

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    //val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    //val numbers = arrayOf<Int>()

    val doubles = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" }
    val emptyNullableArray = arrayOfNulls<Int>(5)

    val readOnlyList: List<String> = listOf("a", "b", "c")

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)

    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    mutableList.add("ui")

    println(mutableList[3])

    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53, 1, -76)
    for(index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("'${list[index--]}'")
    }
}