package com.yaumamydurachok.kotlincourse.lesson6

fun main () {
}

fun season(month: Int): String {
    return when {
        month in 1..2 || month == 12 -> "Зима"
        month in 3..5 -> "Весна"
        month in 6..8 -> "Лето"
        else -> "Осень"
    }
}

fun petAge(years: Double): Any {
    return if (years <= 0) {
        "Некорректный возраст"
    } else if (0 < years && years <= 2) {
        val humanyears = years * 2
        humanyears
    } else {
        val humanyears = ((years - 2)*4) + 21
        humanyears
    }
}

fun vehicleType(length: Int): String {
    return when {
        length in 0..1000 -> "Пешком"
        length in 1001..5000 -> "Велосипед"
        else -> "Автотранспорт"
    }
}

fun bonus(bought: Int) {
    if (bought <= 1000) {
        val bonuses = bought / 100 * 2
    } else {
        val bonuses = 10 + ((bought - 1000) / 100) * 5
    }
}

fun dokktyype(xtnsn: String): Any {
    return if (xtnsn = .txt) {
        "Текстовый документ"
    } else if (xtnsn = .png) || (xtnsn = .jpg) {
        "Изображение"
    } else if (xtnsn = .xls) {
        "Таблица"
    } else {
        "Неизвестный тип"
    }//не понимаю на что ругается Идея, всё подчёркивается красным и жёлтым
}

fun temperature


fun clothes(degrees: Int): String {
    return when {
        degrees in -29..0 -> "Куртка и шапка"
        degrees in 0..15 -> "Ветровка"
        degrees in 16..34 -> "Футболка и шорты"
        else -> "Не выходите из дома"
    }
}

fun cinema(confirmAge: Int): String {
    val aa = "Детские"
    val bb = "Подростковые"
    val cc = "18+"

    return if (confirmAge <= 12) {
        aa
    } else if (confirmAge <= 18) {
        aa, bb
    } else (confirmAge >= 18) {
        aa, bb, cc
    }
}
