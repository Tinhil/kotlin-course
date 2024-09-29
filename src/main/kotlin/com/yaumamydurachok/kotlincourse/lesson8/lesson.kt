package com.yaumamydurachok.kotlincourse.lesson8

fun main(){
    val simpleString = "Prostaya stroka"

    val firstName = "Ivan"
    val lastName = "Ivanov"
    val fullName = firstName + " " + lastName

    val age = 30
    val greeting = "Privet! Menya zovut $firstName, i mne $age let"

    println(greeting)

    val person = Person("Алексей", 25)
    val introduction = "Menya zovut ${person.name} i mne ${person.age} let"

    val details = "Здесь находятся ${getDetails()}"

    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"
    println(resultString)


}

class Person(val name: String, val age: Int)

fun getDetails(): String {
    return "Очень интересные детали"
}

fun main2() {

    val originalString = "Kotlin is fun"
    val subString = originalString.substring(7)
    val subString2 = originalString.substring(3, 6)
    val replacedString = originalString.replace("fun", "awesome")
    val words = originalString.split(" ")
    val length = "Hello".length
    val upper = "hello".uppercase()
    val lower = "HELLO".lowercase()
    val trimmed = "  hello    ".trim()
    val starts = "Kotlin".startsWith("Kot")
    val ends = "Kotlin".endsWith("lin")
    val contains = "Hello".contains("ell")
    val e: String? = null
    val empty = "".isNullOrEmpty()
    val blank = "   ".isNullOrBlank()
    val repeat = "ab".repeat(3)
    val letter = originalString[5]
    val indexOfChar = "Kotlin".indexOf('t')
    val indexOfWord = "Kotlin is the best language".indexOf("best")
    val backReverse = "niltoK".reversed()
    val multiLineString = """
    Первая строка
    Вторая строка
    Третья строка
    """.trimIndent()

    println(subString)

    val name = "Алексей"
    val city = "НиНо"
    val age = 32
    val friendsCount = 0
    val rating = 4.20
    val balance = 8800.55535
    val text = """
        Имя: %s
        Город: %s
        Возраст: %d
        Количество друзей: %,d
        Рейтинг пользователя: %.1f
        Баланс счёта: %,.2f
    """.trimIndent()
    println(text.format(name, city, age, friendsCount, rating, balance))
}