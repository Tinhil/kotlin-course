package com.yaumamydurachok.kotlincourse.lesson7

fun main() {
    for (i in 1..5) {
        println(i)
    }

    for (i in 1..10) {
        if (i % 2 == 0)
        println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }

    for (i in 10 downTo 1 step 2) {
//        i -= 2
        println(i - 2)
    }

    for (i in 1..9 step 2) {
        println(i)
    }

    for (i in 1..20) {
        if (i % 3 != 0) continue
        println(i)
    }

    for (i in 1 until 9) {
        println(i)
    }

    for (i in 3 until 15) {
        println(i)
    }

    var sq = 0
    while (sq++ < 5) {
        println (sq * sq)
    }

    var minus = 10
    while (minus-- >5) {
        println(minus)
    }

    var dw = 5
    do {
        print(dw)
    } while (dw-- > 1)

    var dw2 = 5
    do {
        println ("ыть ")
    } while (++dw2 < 10)

    for (i in 1..10) {
        println(i)
        if (i == 6) break
    }

    var inf = 0
    while (inf++ >= 0) {
        println (inf)
        if (inf == 10) break
    }

    for (i in 1..10) {
        if (i % 2 != 0) continue
        println(i)
    }

    var tri = 0
    while (tri++ <10) {
        if (tri % 3 == 0) continue
        println (tri)
    }

    for (i in 1..10) {
        for (ii in 1..10) {
            print( i * ii)
            print(" ")
        }
        println()
    }
}
