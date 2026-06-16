package com.divingdd.app

/**
 * Таблица коэффициентов трудности (КТ) — перенесена из официальной
 * таблицы пользователя (ФПВ России).
 * Структура: код прыжка -> положение -> высота (м) -> КТ
 */
object DiveTable {

    val table: Map<String, Map<String, Map<String, Double>>> = mapOf(
        "101" to mapOf(
            "A" to mapOf("1" to 1.4, "3" to 1.6, "5" to 1.4, "7.5" to 1.6, "10" to 1.6),
            "B" to mapOf("1" to 1.3, "3" to 1.5, "5" to 1.3, "7.5" to 1.5, "10" to 1.5),
            "C" to mapOf("1" to 1.2, "3" to 1.4, "5" to 1.2, "7.5" to 1.4, "10" to 1.4)
        ),
        "102" to mapOf(
            "A" to mapOf("1" to 1.6, "3" to 1.7, "5" to 1.6, "7.5" to 1.7, "10" to 1.8),
            "B" to mapOf("1" to 1.5, "3" to 1.6, "5" to 1.5, "7.5" to 1.6, "10" to 1.7),
            "C" to mapOf("1" to 1.4, "3" to 1.5, "5" to 1.4, "7.5" to 1.5, "10" to 1.6)
        ),
        "103" to mapOf(
            "A" to mapOf("1" to 2.0, "3" to 1.9, "5" to 2.0, "7.5" to 1.9, "10" to 1.9),
            "B" to mapOf("1" to 1.7, "3" to 1.6, "5" to 1.7, "7.5" to 1.6, "10" to 1.6),
            "C" to mapOf("1" to 1.6, "3" to 1.5, "5" to 1.6, "7.5" to 1.5, "10" to 1.5)
        ),
        "104" to mapOf(
            "A" to mapOf("1" to 2.6, "3" to 2.4, "5" to 2.6, "7.5" to 2.4, "10" to 2.5),
            "B" to mapOf("1" to 2.3, "3" to 2.1, "5" to 2.3, "7.5" to 2.1, "10" to 2.2),
            "C" to mapOf("1" to 2.2, "3" to 2.0, "5" to 2.2, "7.5" to 2.0, "10" to 2.1)
        ),
        "105" to mapOf(
            "A" to mapOf("3" to 2.8, "10" to 2.7),
            "B" to mapOf("1" to 2.6, "3" to 2.4, "5" to 2.6, "7.5" to 2.4, "10" to 2.3),
            "C" to mapOf("1" to 2.4, "3" to 2.2, "5" to 2.4, "7.5" to 2.2, "10" to 2.1)
        ),
        "106" to mapOf(
            "B" to mapOf("1" to 3.2, "3" to 2.8, "5" to 3.2, "7.5" to 2.8, "10" to 3.0),
            "C" to mapOf("1" to 2.9, "3" to 2.5, "5" to 2.9, "7.5" to 2.5, "10" to 2.7)
        ),
        "107" to mapOf(
            "B" to mapOf("1" to 3.3, "3" to 3.1, "7.5" to 3.1, "10" to 3.0),
            "C" to mapOf("1" to 3.0, "3" to 2.8, "5" to 3.0, "7.5" to 2.8, "10" to 2.7)
        ),
        "108" to mapOf(
            "B" to mapOf("3" to 3.8, "10" to 4.1),
            "C" to mapOf("1" to 4.0, "3" to 3.4, "10" to 3.7)
        ),
        "109" to mapOf(
            "B" to mapOf("3" to 4.2, "10" to 4.1),
            "C" to mapOf("1" to 4.3, "3" to 3.8, "10" to 3.7)
        ),
        "112" to mapOf(
            "B" to mapOf("1" to 1.7, "3" to 1.8, "5" to 1.7, "7.5" to 1.8, "10" to 1.9),
            "C" to mapOf("1" to 1.6, "3" to 1.7, "5" to 1.6, "7.5" to 1.7, "10" to 1.8)
        ),
        "113" to mapOf(
            "B" to mapOf("1" to 1.9, "3" to 1.8, "5" to 1.9, "7.5" to 1.8, "10" to 1.8),
            "C" to mapOf("1" to 1.8, "3" to 1.7, "5" to 1.8, "7.5" to 1.7, "10" to 1.7)
        ),
        "114" to mapOf(
            "B" to mapOf("5" to 2.5, "7.5" to 2.3, "10" to 2.4),
            "C" to mapOf("5" to 2.4, "7.5" to 2.2, "10" to 2.3)
        ),
        "115" to mapOf(
            "B" to mapOf("3" to 2.7, "10" to 2.6),
            "C" to mapOf("3" to 2.5, "7.5" to 2.5, "10" to 2.4)
        ),
        "201" to mapOf(
            "A" to mapOf("1" to 1.7, "3" to 1.9, "5" to 1.7, "7.5" to 1.9, "10" to 1.9),
            "B" to mapOf("1" to 1.6, "3" to 1.8, "5" to 1.6, "7.5" to 1.8, "10" to 1.8),
            "C" to mapOf("1" to 1.5, "3" to 1.7, "5" to 1.5, "7.5" to 1.7, "10" to 1.7)
        ),
        "202" to mapOf(
            "A" to mapOf("1" to 1.7, "3" to 1.8, "5" to 1.7, "7.5" to 1.8, "10" to 1.9),
            "B" to mapOf("1" to 1.6, "3" to 1.7, "5" to 1.6, "7.5" to 1.7, "10" to 1.8),
            "C" to mapOf("1" to 1.5, "3" to 1.6, "5" to 1.5, "7.5" to 1.6, "10" to 1.7)
        ),
        "203" to mapOf(
            "A" to mapOf("1" to 2.5, "3" to 2.4, "5" to 2.5, "7.5" to 2.4, "10" to 2.4),
            "B" to mapOf("1" to 2.3, "3" to 2.2, "5" to 2.3, "7.5" to 2.2, "10" to 2.2),
            "C" to mapOf("1" to 2.0, "3" to 1.9, "5" to 2.0, "7.5" to 1.9, "10" to 1.9)
        ),
        "204" to mapOf(
            "A" to mapOf("3" to 2.5, "7.5" to 2.5, "10" to 2.6),
            "B" to mapOf("1" to 2.5, "3" to 2.3, "5" to 2.5, "7.5" to 2.3, "10" to 2.4),
            "C" to mapOf("1" to 2.2, "3" to 2.0, "5" to 2.2, "7.5" to 2.0, "10" to 2.1)
        ),
        "205" to mapOf(
            "A" to mapOf("10" to 3.3),
            "B" to mapOf("1" to 3.2, "3" to 3.0, "5" to 3.2, "7.5" to 3.0, "10" to 2.9),
            "C" to mapOf("1" to 3.0, "3" to 2.8, "5" to 3.0, "7.5" to 2.8, "10" to 2.7)
        ),
        "206" to mapOf(
            "B" to mapOf("1" to 3.2, "3" to 2.8, "5" to 3.2, "7.5" to 2.8, "10" to 3.0),
            "C" to mapOf("1" to 2.9, "3" to 2.5, "5" to 2.9, "7.5" to 2.5, "10" to 2.7)
        ),
        "207" to mapOf(
            "B" to mapOf("3" to 3.9, "10" to 3.6),
            "C" to mapOf("3" to 3.6, "7.5" to 3.5, "10" to 3.3)
        ),
        "208" to mapOf(
            "B" to mapOf("3" to 3.7, "5" to 4.4, "7.5" to 4.2, "10" to 4.1),
            "C" to mapOf("3" to 3.4, "5" to 4.1, "7.5" to 3.9, "10" to 3.8)
        ),
        "209" to mapOf(
            "B" to mapOf("3" to 4.7, "10" to 4.5),
            "C" to mapOf("3" to 4.4, "10" to 4.2)
        ),
        "212" to mapOf(
            "B" to mapOf("1" to 1.7, "3" to 1.8, "5" to 1.7, "7.5" to 1.8, "10" to 1.9),
            "C" to mapOf("1" to 1.6, "3" to 1.7, "5" to 1.6, "7.5" to 1.7, "10" to 1.8)
        ),
        "213" to mapOf(
            "B" to mapOf("3" to 2.4, "5" to 2.5, "7.5" to 2.4, "10" to 2.4),
            "C" to mapOf("3" to 2.1, "5" to 2.2, "7.5" to 2.1, "10" to 2.1)
        ),
        "215" to mapOf(
            "B" to mapOf("3" to 3.3, "10" to 3.2),
            "C" to mapOf("3" to 3.1, "10" to 3.0)
        ),
        "301" to mapOf(
            "A" to mapOf("1" to 1.8, "3" to 2.0, "5" to 1.8, "7.5" to 2.0, "10" to 2.0),
            "B" to mapOf("1" to 1.7, "3" to 1.9, "5" to 1.7, "7.5" to 1.9, "10" to 1.9),
            "C" to mapOf("1" to 1.6, "3" to 1.8, "5" to 1.6, "7.5" to 1.8, "10" to 1.8)
        ),
        "302" to mapOf(
            "A" to mapOf("1" to 1.8, "3" to 1.9, "5" to 1.8, "7.5" to 1.9, "10" to 2.0),
            "B" to mapOf("1" to 1.7, "3" to 1.8, "5" to 1.7, "7.5" to 1.8, "10" to 1.9),
            "C" to mapOf("1" to 1.6, "3" to 1.7, "5" to 1.6, "7.5" to 1.7, "10" to 1.8)
        ),
        "303" to mapOf(
            "A" to mapOf("1" to 2.7, "3" to 2.6, "5" to 2.7, "7.5" to 2.6, "10" to 2.6),
            "B" to mapOf("1" to 2.4, "3" to 2.3, "5" to 2.4, "7.5" to 2.3, "10" to 2.3),
            "C" to mapOf("1" to 2.1, "3" to 2.0, "5" to 2.1, "7.5" to 2.0, "10" to 2.0)
        ),
        "304" to mapOf(
            "A" to mapOf("1" to 2.9, "3" to 2.7, "5" to 2.9, "7.5" to 2.7, "10" to 2.8),
            "B" to mapOf("1" to 2.6, "3" to 2.4, "5" to 2.6, "7.5" to 2.4, "10" to 2.5),
            "C" to mapOf("1" to 2.3, "3" to 2.1, "5" to 2.3, "7.5" to 2.1, "10" to 2.2)
        ),
        "305" to mapOf(
            "A" to mapOf("3" to 3.4, "7.5" to 3.5, "10" to 3.4),
            "B" to mapOf("1" to 3.2, "3" to 3.0, "5" to 3.3, "7.5" to 3.1, "10" to 3.0),
            "C" to mapOf("1" to 3.0, "3" to 2.8, "5" to 3.1, "7.5" to 2.9, "10" to 2.8)
        ),
        "306" to mapOf(
            "B" to mapOf("1" to 3.3, "3" to 2.9, "5" to 3.4, "7.5" to 3.0, "10" to 3.2),
            "C" to mapOf("1" to 3.0, "3" to 2.6, "5" to 3.1, "7.5" to 2.7, "10" to 2.9)
        ),
        "307" to mapOf(
            "B" to mapOf("3" to 3.8, "10" to 3.7),
            "C" to mapOf("3" to 3.5, "10" to 3.4)
        ),
        "308" to mapOf(
            "B" to mapOf("3" to 3.7, "7.5" to 4.5, "10" to 4.4),
            "C" to mapOf("3" to 3.4, "7.5" to 4.2, "10" to 4.1)
        ),
        "309" to mapOf(
            "B" to mapOf("3" to 4.7, "10" to 4.8),
            "C" to mapOf("3" to 4.4, "10" to 4.5)
        ),
        "312" to mapOf(
            "B" to mapOf("1" to 1.8, "3" to 1.9, "5" to 1.8, "7.5" to 1.9, "10" to 2.0),
            "C" to mapOf("1" to 1.7, "3" to 1.8, "5" to 1.7, "7.5" to 1.8, "10" to 1.9)
        ),
        "313" to mapOf(
            "B" to mapOf("1" to 2.6, "3" to 2.5, "5" to 2.6, "7.5" to 2.5, "10" to 2.5),
            "C" to mapOf("1" to 2.3, "3" to 2.2, "5" to 2.3, "7.5" to 2.2, "10" to 2.2)
        ),
        "401" to mapOf(
            "A" to mapOf("1" to 1.8, "3" to 1.7, "5" to 1.8, "7.5" to 1.7, "10" to 1.7),
            "B" to mapOf("1" to 1.5, "3" to 1.4, "5" to 1.5, "7.5" to 1.4, "10" to 1.4),
            "C" to mapOf("1" to 1.4, "3" to 1.3, "5" to 1.4, "7.5" to 1.3, "10" to 1.3)
        ),
        "402" to mapOf(
            "A" to mapOf("1" to 2.0, "3" to 1.8, "5" to 2.0, "7.5" to 1.8, "10" to 1.9),
            "B" to mapOf("1" to 1.7, "3" to 1.5, "5" to 1.7, "7.5" to 1.5, "10" to 1.6),
            "C" to mapOf("1" to 1.6, "3" to 1.4, "5" to 1.6, "7.5" to 1.4, "10" to 1.5)
        ),
        "403" to mapOf(
            "B" to mapOf("1" to 2.4, "3" to 2.1, "5" to 2.4, "7.5" to 2.1, "10" to 2.0),
            "C" to mapOf("1" to 2.2, "3" to 1.9, "5" to 2.2, "7.5" to 1.9, "10" to 1.8)
        ),
        "404" to mapOf(
            "B" to mapOf("1" to 3.0, "3" to 2.6, "5" to 3.0, "7.5" to 2.6, "10" to 2.6),
            "C" to mapOf("1" to 2.8, "3" to 2.4, "5" to 2.8, "7.5" to 2.4, "10" to 2.4)
        ),
        "405" to mapOf(
            "B" to mapOf("1" to 3.4, "3" to 3.0, "5" to 3.4, "7.5" to 3.0, "10" to 2.8),
            "C" to mapOf("1" to 3.1, "3" to 2.7, "5" to 3.1, "7.5" to 2.7, "10" to 2.5)
        ),
        "406" to mapOf(
            "B" to mapOf("5" to 4.0, "7.5" to 3.4, "10" to 3.5),
            "C" to mapOf("5" to 3.7, "7.5" to 3.1, "10" to 3.2)
        ),
        "407" to mapOf(
            "B" to mapOf("3" to 3.7, "10" to 3.5),
            "C" to mapOf("3" to 3.4, "7.5" to 3.4, "10" to 3.2)
        ),
        "408" to mapOf(
            "B" to mapOf("10" to 4.4),
            "C" to mapOf("10" to 4.1)
        ),
        "409" to mapOf(
            "B" to mapOf("3" to 4.6, "10" to 4.4),
            "C" to mapOf("3" to 4.2, "10" to 4.1)
        ),
        "412" to mapOf(
            "B" to mapOf("1" to 2.1, "3" to 1.9, "5" to 2.1, "7.5" to 1.9, "10" to 2.0),
            "C" to mapOf("1" to 2.0, "3" to 1.8, "5" to 2.0, "7.5" to 1.8, "10" to 1.9)
        ),
        "413" to mapOf(
            "B" to mapOf("1" to 2.9, "3" to 2.6, "5" to 2.9, "7.5" to 2.6, "10" to 2.5),
            "C" to mapOf("1" to 2.7, "3" to 2.4, "5" to 2.7, "7.5" to 2.4, "10" to 2.3)
        ),
        "600" to mapOf(
            "A" to mapOf("5" to 1.5, "7.5" to 1.6, "10" to 1.6)
        ),
        "611" to mapOf(
            "A" to mapOf("5" to 1.8, "7.5" to 2.0, "10" to 2.0),
            "B" to mapOf("5" to 1.7, "7.5" to 1.9, "10" to 1.9),
            "C" to mapOf("5" to 1.5, "7.5" to 1.7, "10" to 1.7)
        ),
        "612" to mapOf(
            "A" to mapOf("5" to 1.8, "7.5" to 1.9, "10" to 2.0),
            "B" to mapOf("5" to 1.7, "7.5" to 1.8, "10" to 1.9),
            "C" to mapOf("5" to 1.5, "7.5" to 1.6, "10" to 1.7)
        ),
        "614" to mapOf(
            "B" to mapOf("5" to 2.5, "7.5" to 2.3, "10" to 2.4),
            "C" to mapOf("5" to 2.2, "7.5" to 2.0, "10" to 2.1)
        ),
        "616" to mapOf(
            "B" to mapOf("10" to 3.3),
            "C" to mapOf("10" to 3.1)
        ),
        "621" to mapOf(
            "A" to mapOf("5" to 1.7, "7.5" to 1.9, "10" to 1.9),
            "B" to mapOf("5" to 1.6, "7.5" to 1.8, "10" to 1.8),
            "C" to mapOf("5" to 1.4, "7.5" to 1.6, "10" to 1.6)
        ),
        "622" to mapOf(
            "A" to mapOf("5" to 2.1, "7.5" to 2.2, "10" to 2.3),
            "B" to mapOf("5" to 2.0, "7.5" to 2.1, "10" to 2.2),
            "C" to mapOf("5" to 1.8, "7.5" to 1.9, "10" to 2.0)
        ),
        "623" to mapOf(
            "B" to mapOf("5" to 2.3, "7.5" to 2.2, "10" to 2.2),
            "C" to mapOf("5" to 2.0, "7.5" to 1.9, "10" to 1.9)
        ),
        "624" to mapOf(
            "A" to mapOf("5" to 3.1, "7.5" to 2.9, "10" to 3.0),
            "B" to mapOf("5" to 2.9, "7.5" to 2.7, "10" to 2.8),
            "C" to mapOf("5" to 2.6, "7.5" to 2.4, "10" to 2.5)
        ),
        "626" to mapOf(
            "B" to mapOf("7.5" to 3.3, "10" to 3.5),
            "C" to mapOf("5" to 3.5, "7.5" to 3.1, "10" to 3.3)
        ),
        "628" to mapOf(
            "B" to mapOf("10" to 4.7),
            "C" to mapOf("10" to 4.5)
        ),
        "631" to mapOf(
            "A" to mapOf("5" to 1.8, "7.5" to 2.0, "10" to 2.0),
            "B" to mapOf("5" to 1.7, "7.5" to 1.9, "10" to 1.9),
            "C" to mapOf("5" to 1.5, "7.5" to 1.7, "10" to 1.7)
        ),
        "632" to mapOf(
            "B" to mapOf("5" to 2.1, "7.5" to 2.2, "10" to 2.3),
            "C" to mapOf("5" to 1.9, "7.5" to 2.0, "10" to 2.1)
        ),
        "633" to mapOf(
            "B" to mapOf("5" to 2.4, "7.5" to 2.3, "10" to 2.3),
            "C" to mapOf("5" to 2.1, "7.5" to 2.0, "10" to 2.0)
        ),
        "634" to mapOf(
            "B" to mapOf("5" to 3.0, "7.5" to 2.8, "10" to 2.9),
            "C" to mapOf("5" to 2.7, "7.5" to 2.5, "10" to 2.6)
        ),
        "636" to mapOf(
            "B" to mapOf("10" to 3.6),
            "C" to mapOf("7.5" to 3.2, "10" to 3.4)
        ),
        "638" to mapOf(
            "B" to mapOf("10" to 4.8),
            "C" to mapOf("10" to 4.6)
        ),
        "1011" to mapOf(
            "C" to mapOf("10" to 4.7)
        ),
        "5111" to mapOf(
            "A" to mapOf("1" to 1.8, "3" to 2.0, "5" to 1.8, "7.5" to 2.0, "10" to 2.0),
            "B" to mapOf("1" to 1.7, "3" to 1.9, "5" to 1.7, "7.5" to 1.9, "10" to 1.9),
            "C" to mapOf("1" to 1.6, "3" to 1.8, "5" to 1.6, "7.5" to 1.8, "10" to 1.8)
        ),
        "5112" to mapOf(
            "A" to mapOf("1" to 2.0, "3" to 2.2, "5" to 2.0, "7.5" to 2.2, "10" to 2.2),
            "B" to mapOf("1" to 1.9, "3" to 2.1, "5" to 1.9, "7.5" to 2.1, "10" to 2.1)
        ),
        "5121" to mapOf(
            "D" to mapOf("1" to 1.7, "3" to 1.8, "5" to 1.7, "7.5" to 1.8, "10" to 1.9)
        ),
        "5122" to mapOf(
            "D" to mapOf("1" to 1.9, "3" to 2.0, "5" to 1.9, "7.5" to 2.0, "10" to 2.1)
        ),
        "5124" to mapOf(
            "D" to mapOf("1" to 2.3, "3" to 2.4, "5" to 2.3, "7.5" to 2.4, "10" to 2.5)
        ),
        "5126" to mapOf(
            "D" to mapOf("1" to 2.8, "3" to 2.9)
        ),
        "5131" to mapOf(
            "D" to mapOf("1" to 2.0, "3" to 1.9, "5" to 2.0, "7.5" to 1.9, "10" to 1.9)
        ),
        "5132" to mapOf(
            "D" to mapOf("1" to 2.2, "3" to 2.1, "5" to 2.2, "7.5" to 2.1, "10" to 2.1)
        ),
        "5134" to mapOf(
            "D" to mapOf("1" to 2.6, "3" to 2.5, "5" to 2.6, "7.5" to 2.5, "10" to 2.5)
        ),
        "5136" to mapOf(
            "D" to mapOf("1" to 3.1, "3" to 3.0, "5" to 3.1, "7.5" to 3.0, "10" to 3.0)
        ),
        "5138" to mapOf(
            "D" to mapOf("1" to 3.5, "3" to 3.4, "5" to 3.5, "7.5" to 3.4, "10" to 3.4)
        ),
        "5151" to mapOf(
            "B" to mapOf("1" to 3.0, "3" to 2.8),
            "C" to mapOf("1" to 2.8, "3" to 2.6)
        ),
        "5152" to mapOf(
            "B" to mapOf("1" to 3.2, "3" to 3.0, "5" to 3.2, "7.5" to 3.0, "10" to 2.9),
            "C" to mapOf("1" to 3.0, "3" to 2.8, "5" to 3.0, "7.5" to 2.8, "10" to 2.7)
        ),
        "5154" to mapOf(
            "B" to mapOf("1" to 3.6, "3" to 3.4, "5" to 3.6, "7.5" to 3.4, "10" to 3.3),
            "C" to mapOf("1" to 3.4, "3" to 3.2, "5" to 3.4, "7.5" to 3.2, "10" to 3.1)
        ),
        "5156" to mapOf(
            "B" to mapOf("3" to 3.9, "10" to 3.8),
            "C" to mapOf("3" to 3.7, "10" to 3.6)
        ),
        "5172" to mapOf(
            "B" to mapOf("3" to 3.7, "7.5" to 3.7, "10" to 3.6),
            "C" to mapOf("3" to 3.4, "7.5" to 3.4, "10" to 3.3)
        ),
        "5211" to mapOf(
            "A" to mapOf("1" to 1.8, "3" to 2.0, "5" to 1.8, "7.5" to 2.0, "10" to 2.0),
            "B" to mapOf("1" to 1.7, "3" to 1.9, "5" to 1.7, "7.5" to 1.9, "10" to 1.9),
            "C" to mapOf("1" to 1.6, "3" to 1.8, "5" to 1.6, "7.5" to 1.8, "10" to 1.8)
        ),
        "5212" to mapOf(
            "A" to mapOf("1" to 2.0, "3" to 2.2, "5" to 2.0, "7.5" to 2.2, "10" to 2.2)
        ),
        "5221" to mapOf(
            "D" to mapOf("1" to 1.7, "3" to 1.8, "5" to 1.7, "7.5" to 1.8, "10" to 1.9)
        ),
        "5222" to mapOf(
            "D" to mapOf("1" to 1.9, "3" to 2.0, "5" to 1.9, "7.5" to 2.0, "10" to 2.1)
        ),
        "5223" to mapOf(
            "D" to mapOf("1" to 2.3, "3" to 2.4, "5" to 2.3, "7.5" to 2.4, "10" to 2.5)
        ),
        "5225" to mapOf(
            "D" to mapOf("1" to 2.7, "3" to 2.8, "5" to 2.7, "7.5" to 2.8, "10" to 2.9)
        ),
        "5227" to mapOf(
            "D" to mapOf("1" to 3.2, "3" to 3.3)
        ),
        "5231" to mapOf(
            "D" to mapOf("1" to 2.1, "3" to 2.0, "5" to 2.1, "7.5" to 2.0, "10" to 2.0)
        ),
        "5233" to mapOf(
            "D" to mapOf("1" to 2.5, "3" to 2.4, "5" to 2.5, "7.5" to 2.4, "10" to 2.4)
        ),
        "5235" to mapOf(
            "D" to mapOf("1" to 2.9, "3" to 2.8, "5" to 2.9, "7.5" to 2.8, "10" to 2.8)
        ),
        "5237" to mapOf(
            "D" to mapOf("3" to 3.3, "5" to 3.4, "7.5" to 3.3, "10" to 3.3)
        ),
        "5239" to mapOf(
            "D" to mapOf("3" to 3.7, "5" to 3.8, "7.5" to 3.7, "10" to 3.7)
        ),
        "5251" to mapOf(
            "B" to mapOf("1" to 2.9, "3" to 2.7, "5" to 2.9, "7.5" to 2.7, "10" to 2.6),
            "C" to mapOf("1" to 2.7, "3" to 2.5, "5" to 2.7, "7.5" to 2.5, "10" to 2.4)
        ),
        "5253" to mapOf(
            "B" to mapOf("3" to 3.4, "7.5" to 3.3, "10" to 3.2),
            "C" to mapOf("3" to 3.2, "7.5" to 3.1, "10" to 3.0)
        ),
        "5255" to mapOf(
            "B" to mapOf("3" to 3.8, "10" to 3.6),
            "C" to mapOf("3" to 3.6, "10" to 3.4)
        ),
        "5257" to mapOf(
            "B" to mapOf("10" to 4.1),
            "C" to mapOf("10" to 3.9)
        ),
        "5271" to mapOf(
            "B" to mapOf("10" to 3.2),
            "C" to mapOf("10" to 2.9)
        ),
        "5273" to mapOf(
            "B" to mapOf("10" to 3.8),
            "C" to mapOf("10" to 3.5)
        ),
        "5275" to mapOf(
            "B" to mapOf("10" to 4.2),
            "C" to mapOf("10" to 3.9)
        ),
        "5311" to mapOf(
            "A" to mapOf("1" to 1.9, "3" to 2.1, "5" to 1.9, "7.5" to 2.1, "10" to 2.1),
            "B" to mapOf("1" to 1.8, "3" to 2.0, "5" to 1.8, "7.5" to 2.0, "10" to 2.0),
            "C" to mapOf("1" to 1.7, "3" to 1.9, "5" to 1.7, "7.5" to 1.9, "10" to 1.9)
        ),
        "5312" to mapOf(
            "A" to mapOf("1" to 2.1, "3" to 2.3, "5" to 2.1, "7.5" to 2.3, "10" to 2.3)
        ),
        "5321" to mapOf(
            "D" to mapOf("1" to 1.8, "3" to 1.9, "5" to 1.8, "7.5" to 1.9, "10" to 2.0)
        ),
        "5322" to mapOf(
            "D" to mapOf("1" to 2.0, "3" to 2.1, "5" to 2.0, "7.5" to 2.1, "10" to 2.2)
        ),
        "5323" to mapOf(
            "D" to mapOf("1" to 2.4, "3" to 2.5, "5" to 2.4, "7.5" to 2.5, "10" to 2.6)
        ),
        "5325" to mapOf(
            "D" to mapOf("1" to 2.8, "3" to 2.9, "5" to 2.8, "7.5" to 2.9, "10" to 3.0)
        ),
        "5331" to mapOf(
            "D" to mapOf("1" to 2.2, "3" to 2.1, "5" to 2.2, "7.5" to 2.1, "10" to 2.1)
        ),
        "5333" to mapOf(
            "D" to mapOf("1" to 2.6, "3" to 2.5, "5" to 2.6, "7.5" to 2.5, "10" to 2.5)
        ),
        "5335" to mapOf(
            "D" to mapOf("1" to 3.0, "3" to 2.9, "5" to 3.0, "7.5" to 2.9, "10" to 2.9)
        ),
        "5337" to mapOf(
            "D" to mapOf("1" to 3.6, "3" to 3.5, "5" to 3.5, "7.5" to 3.4, "10" to 3.4)
        ),
        "5339" to mapOf(
            "D" to mapOf("3" to 3.8, "7.5" to 3.8, "10" to 3.8)
        ),
        "5351" to mapOf(
            "B" to mapOf("1" to 2.9, "3" to 2.7, "5" to 3.0, "7.5" to 2.8, "10" to 2.7),
            "C" to mapOf("1" to 2.7, "3" to 2.5, "5" to 2.8, "7.5" to 2.6, "10" to 2.5)
        ),
        "5353" to mapOf(
            "B" to mapOf("1" to 3.5, "3" to 3.3, "7.5" to 3.4, "10" to 3.3),
            "C" to mapOf("1" to 3.3, "3" to 3.1, "5" to 3.4, "7.5" to 3.2, "10" to 3.1)
        ),
        "5355" to mapOf(
            "B" to mapOf("1" to 3.9, "3" to 3.7, "7.5" to 3.8, "10" to 3.7),
            "C" to mapOf("1" to 3.7, "3" to 3.5, "5" to 3.8, "7.5" to 3.6, "10" to 3.5)
        ),
        "5371" to mapOf(
            "B" to mapOf("3" to 3.4, "10" to 3.3),
            "C" to mapOf("3" to 3.1, "10" to 3.0)
        ),
        "5373" to mapOf(
            "C" to mapOf("3" to 3.7, "10" to 3.6)
        ),
        "5375" to mapOf(
            "C" to mapOf("3" to 4.1, "10" to 4.0)
        ),
        "5411" to mapOf(
            "A" to mapOf("1" to 2.0, "3" to 1.9, "5" to 2.0, "7.5" to 1.9, "10" to 1.9),
            "B" to mapOf("1" to 1.7, "3" to 1.6, "5" to 1.7, "7.5" to 1.6, "10" to 1.6),
            "C" to mapOf("1" to 1.6, "3" to 1.5, "5" to 1.6, "7.5" to 1.5, "10" to 1.5)
        ),
        "5412" to mapOf(
            "A" to mapOf("1" to 2.2, "3" to 2.1, "5" to 2.2, "7.5" to 2.1, "10" to 2.1),
            "B" to mapOf("1" to 1.9, "3" to 1.8, "5" to 1.9, "7.5" to 1.8, "10" to 1.8),
            "C" to mapOf("1" to 1.8, "3" to 1.7, "5" to 1.8, "7.5" to 1.7, "10" to 1.7)
        ),
        "5421" to mapOf(
            "D" to mapOf("1" to 1.9, "3" to 1.7, "5" to 1.9, "7.5" to 1.7, "10" to 1.8)
        ),
        "5422" to mapOf(
            "D" to mapOf("1" to 2.1, "3" to 1.9, "5" to 2.1, "7.5" to 1.9, "10" to 2.0)
        ),
        "5432" to mapOf(
            "D" to mapOf("1" to 2.7, "3" to 2.4, "5" to 2.7, "7.5" to 2.4, "10" to 2.3)
        ),
        "5434" to mapOf(
            "D" to mapOf("1" to 3.1, "3" to 2.8, "5" to 3.1, "7.5" to 2.8, "10" to 2.7)
        ),
        "5436" to mapOf(
            "D" to mapOf("3" to 3.5, "10" to 3.4)
        ),
        "6122" to mapOf(
            "D" to mapOf("5" to 2.4, "7.5" to 2.5, "10" to 2.6)
        ),
        "6124" to mapOf(
            "D" to mapOf("5" to 2.7, "7.5" to 2.8, "10" to 2.9)
        ),
        "6142" to mapOf(
            "D" to mapOf("5" to 3.2, "7.5" to 3.0, "10" to 3.1)
        ),
        "6144" to mapOf(
            "D" to mapOf("5" to 3.5, "7.5" to 3.3, "10" to 3.4)
        ),
        "6162" to mapOf(
            "C" to mapOf("10" to 3.9)
        ),
        "6221" to mapOf(
            "D" to mapOf("5" to 1.6, "7.5" to 1.7, "10" to 1.8)
        ),
        "6241" to mapOf(
            "B" to mapOf("5" to 2.8, "7.5" to 2.6, "10" to 2.7),
            "C" to mapOf("5" to 2.5, "7.5" to 2.3, "10" to 2.4)
        ),
        "6243" to mapOf(
            "D" to mapOf("5" to 3.3, "7.5" to 3.1, "10" to 3.2)
        ),
        "6245" to mapOf(
            "D" to mapOf("5" to 3.7, "7.5" to 3.5, "10" to 3.6)
        ),
        "6247" to mapOf(
            "D" to mapOf("10" to 4.0)
        ),
        "6261" to mapOf(
            "B" to mapOf("5" to 3.6, "7.5" to 3.2, "10" to 3.4),
            "C" to mapOf("5" to 3.4, "7.5" to 3.0, "10" to 3.2)
        ),
        "6263" to mapOf(
            "B" to mapOf("10" to 4.2),
            "C" to mapOf("10" to 4.0)
        ),
        "6265" to mapOf(
            "B" to mapOf("10" to 4.6),
            "C" to mapOf("10" to 4.4)
        )
    )
}
