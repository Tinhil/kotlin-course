//package com.yaumamydurachok.kotlincourse.lesson6
//
//fun main() {
//    if (условие1) {
//        //код для выполнения, если условие1 истинно
//    } else if (условие2) {
//        //код, если условие2 истинно
//    } else {
//        //код, если оба условия ложны
//    }
//}
//
//fun example() {
//    val number = getNumber()
//    if (number > 5) {
//        println("Число больше 5")
//    } else {
//        println("Число меньше или равно 5")
//    }
//}
//
//fun example2() {
//    val intRange: IntRange = 1..10
//    val intRangeUntil = 1 until 10
//    val downTo = 10 downTo 1
//    val charRange: CharRange = 'd'..'r'
//
//    val inRange = 2 in intRange
//    val notInRange = 20 !in intRange
//
//    when (значение) {
//        выражение1 -> { /* код */
//        }
//
//        выражение2 -> { /* код */
//        }
//
//        else -> {/* код */
//        }
//
//    }
//}
//
//fun example3() {
//    val score = 95
//    when () {
//        score in 90..100 -> println("Отлично")
//        score in 80..89 -> println("Хорошо")
//        score in 70..79 -> println("Удовлетворительно")
//        else -> println("Нужно подучить")
//    }
//
//    val score2 = 85
//    when (score2) {
//        in 90..100 -> println("Отлично")
//        in 80..89 -> println("Хорошо")
//        in 70..79 -> println("Удовлетворительно")
//        else -> println("Нужно подучить")
//    }
//
//    val a = 3
//    val b = 4
//
//    val max = if (a > b) {
//        a
//    } else b {
//    }
//    val score3 = 78
//    val result = when (score3) {
//        in 90..100 -> "Отлично"
//        in 80..89 -> "Хорошо"
//        in 70..79 -> "Удовлетворительно"
//        else -> "Нужно подучить"
//    }
//    println(result)
//}
//
//fun retTimesOfDay(hour: Int): String {
////    if (hour in 0..4) return "Ночь"
////    if (hour >=5 && hour < 12) return "Утро"
////    return if (hour < 0 || > 23) {
////        "Неверное значение времени"
////    } else if (hour in 0..4) {
////        "Ночь"
////    } else if (hour >=5 && hour < 12) {
////        "Утро"
////    } else if (hour in 12..16) {
////        "День"
////    } else {
////        "Вечер"
////    }
//    return when {
//        hour in < 0 || > 23 -> "Неверное значение времени"
//        hour in 0..4 -> "Ночь"
//        hour >=5 && hour < 12 -> "Утро"
//        hour in 12..16 -> "День"
//        else -> "Вечер"
//    }
//}