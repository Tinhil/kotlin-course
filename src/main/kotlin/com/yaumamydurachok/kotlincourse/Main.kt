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