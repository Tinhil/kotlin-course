package com.yaumamydurachok.com.yaumamydurachok.kotlincourse

val chassis: String = "1982az"

var color: String = "white"

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4

val report: String by lazy {
    ""
}

var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value > 0) field += value
    }

val myInt: Int = 2147483647
val myFloat: Float = 0.58F
val myLong: Long = 1_234_567_890L
val myShort: Short = 32000
val myByte: Byte = 120
val myDouble: Double = 5.99

val isKotlinFun: Boolean = true

val letter: Char = 'A'

val numbers: Array<Int> = arrayOf(1, 2, 3)
val strings: List<String> = listOf("one", "two", "three")
val doubles: Set<Double> = setOf(23.3, 56.8)

val keysToValues: Map<String, String> = mapOf(
    "Ключ 1" to "Значение 1",
    "Ключ 2" to "Значение 2",
)

val anything: Any = "Ыть"

//ещё тут Unit и Nothing