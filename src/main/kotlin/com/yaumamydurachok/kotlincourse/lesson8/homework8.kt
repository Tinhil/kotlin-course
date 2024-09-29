package com.yaumamydurachok.kotlincourse.lesson8


fun quest1() {
    val loginDateTime = "Пользователь вошёл в систему -> 2021-12-01 09:48:23"
    val splitDateTime = loginDateTime.split(" -> ")
    print(splitDateTime)
}

fun quest2() {
    val digits = "4539 1488 0343 6467"
    val newDigits = digits.replace("4539 1488 0343","**** **** ****")
    print (newDigits)
}

fun quest3 () {
    val soap = "username@example.com"
    val soap1 = soap.replace("@", "[at]")
    val soap2 = soap1.replace(".", "dot")
    print(soap2)
}