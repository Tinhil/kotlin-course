//package com.yaumamydurachok.kotlincourse.lesson5
//
//fun main() {
//    val sum = 5 + 3
//    val dif = 10 - 5
//    val product = 10 * 5
//    val quotient = 10 / 5
//    val remainder = 10 % 5
//    val remainder1 = 10 % 6
//    val remainder2 = 10 % 4
//    val isEqual = (5 == 5)
//    val isNotEqual = (5 != 5)
//    val isLesser = (5 < 3)
//    val isGreater = (5 > 3)
//    val isGereaterOrEqual = (5 >= 5)
//    val isLesserOrEqual = (5 <= 3)
//    val andResult = false && false
//    val orResult = true || false
//    val notResult = !(5 > 3)
//    var number = 5
//    number += 3
//    number -= 2
//    number *= 2
//    number /= 2
//
//    number++
//    number--
//    ++number
//    --number
//
//    val example = ((8 + 1) >= 9) || (6 -2 != 4) && (2 * 3 == 6)
//
//    println(number++)
//    println(number)
//
//    var name: String? = null
//
//    val result = name ?: "Unknown"
//
//    var name: String? = getName()
//
//    val result = name ?: throw Exception("Не может быть null")
//}
//
//fun printVolume(userVolume: Int?) {
//    val defaultVolume = 30
//    println(userVolume ?: defaultVolume)
//
//}
//
//fun printPrice(price: Double, s: Int?){
//    val koef = (100.0 - (s ?: 0))/100.0
//            println(price * koef)
//}
