package com.divingdd.app

/**
 * Таблица коэффициентов трудности (КТ) по правилам FINA / World Aquatics.
 * Структура: код прыжка -> положение -> высота (м) -> КТ
 */
object DiveTable {

    val table: Map<String, Map<String, Map<String, Double>>> = mapOf(

        // ── ГРУППА 1: Прыжки вперёд ─────────────────────────────────
        "101" to mapOf(
            "A" to mapOf("1" to 1.4, "3" to 1.6),
            "B" to mapOf("1" to 1.3, "3" to 1.5),
            "C" to mapOf("1" to 1.2, "3" to 1.4)
        ),
        "102" to mapOf(
            "A" to mapOf("1" to 1.6, "3" to 1.7),
            "B" to mapOf("1" to 1.5, "3" to 1.6),
            "C" to mapOf("1" to 1.4, "3" to 1.5)
        ),
        "103" to mapOf(
            "A" to mapOf("1" to 2.1, "3" to 2.0),
            "B" to mapOf("1" to 1.7, "3" to 1.6, "5" to 1.7),
            "C" to mapOf("1" to 1.6, "3" to 1.5, "5" to 1.6)
        ),
        "104" to mapOf(
            "B" to mapOf("1" to 2.2, "3" to 2.2, "5" to 2.2, "7.5" to 2.3, "10" to 2.4),
            "C" to mapOf("1" to 2.2, "3" to 2.2, "5" to 2.2, "7.5" to 2.3, "10" to 2.4)
        ),
        "105" to mapOf(
            "B" to mapOf("3" to 2.4, "5" to 2.6, "7.5" to 2.8, "10" to 3.0),
            "C" to mapOf("3" to 2.6, "5" to 2.8, "7.5" to 3.0, "10" to 3.2)
        ),
        "106" to mapOf(
            "B" to mapOf("5" to 2.9, "7.5" to 3.2, "10" to 3.4),
            "C" to mapOf("5" to 3.0, "7.5" to 3.3, "10" to 3.5)
        ),
        "107" to mapOf(
            "B" to mapOf("5" to 3.4, "7.5" to 3.6, "10" to 3.8),
            "C" to mapOf("5" to 3.5, "7.5" to 3.7, "10" to 3.9)
        ),

        // ── ГРУППА 2: Прыжки назад ──────────────────────────────────
        "201" to mapOf(
            "A" to mapOf("1" to 1.7, "3" to 1.9, "5" to 2.0),
            "B" to mapOf("1" to 1.6, "3" to 1.8, "5" to 1.9),
            "C" to mapOf("1" to 1.5, "3" to 1.7, "5" to 1.8)
        ),
        "202" to mapOf(
            "A" to mapOf("1" to 1.9, "3" to 2.0),
            "B" to mapOf("1" to 1.7, "3" to 1.8),
            "C" to mapOf("1" to 1.6, "3" to 1.7)
        ),
        "203" to mapOf(
            "B" to mapOf("1" to 2.2, "3" to 2.3, "5" to 2.3, "7.5" to 2.4, "10" to 2.5),
            "C" to mapOf("1" to 2.2, "3" to 2.3, "5" to 2.3, "7.5" to 2.4, "10" to 2.5)
        ),
        "204" to mapOf(
            "B" to mapOf("3" to 2.6, "5" to 2.7, "7.5" to 2.9, "10" to 3.1),
            "C" to mapOf("3" to 2.7, "5" to 2.8, "7.5" to 3.0, "10" to 3.2)
        ),
        "205" to mapOf(
            "B" to mapOf("3" to 3.0, "5" to 3.2, "7.5" to 3.4, "10" to 3.6),
            "C" to mapOf("3" to 3.2, "5" to 3.4, "7.5" to 3.6, "10" to 3.8)
        ),
        "206" to mapOf(
            "B" to mapOf("5" to 3.5, "7.5" to 3.8, "10" to 4.0),
            "C" to mapOf("5" to 3.5, "7.5" to 3.9, "10" to 4.1)
        ),

        // ── ГРУППА 3: Оборот назад (Reverse) ────────────────────────
        "301" to mapOf(
            "A" to mapOf("1" to 1.8, "3" to 2.0, "5" to 2.1),
            "B" to mapOf("1" to 1.7, "3" to 1.9, "5" to 2.0),
            "C" to mapOf("1" to 1.6, "3" to 1.8, "5" to 1.9)
        ),
        "302" to mapOf(
            "A" to mapOf("1" to 2.0, "3" to 2.1),
            "B" to mapOf("1" to 1.8, "3" to 1.9),
            "C" to mapOf("1" to 1.7, "3" to 1.8)
        ),
        "303" to mapOf(
            "B" to mapOf("1" to 2.4, "3" to 2.5, "5" to 2.5, "7.5" to 2.7, "10" to 2.8),
            "C" to mapOf("1" to 2.4, "3" to 2.5, "5" to 2.5, "7.5" to 2.7, "10" to 2.8)
        ),
        "304" to mapOf(
            "B" to mapOf("3" to 2.9, "5" to 3.0, "7.5" to 3.2, "10" to 3.4),
            "C" to mapOf("3" to 3.0, "5" to 3.1, "7.5" to 3.3, "10" to 3.5)
        ),
        "305" to mapOf(
            "B" to mapOf("3" to 3.2, "5" to 3.4, "7.5" to 3.6, "10" to 3.8),
            "C" to mapOf("3" to 3.4, "5" to 3.6, "7.5" to 3.8, "10" to 4.0)
        ),
        "306" to mapOf(
            "B" to mapOf("5" to 3.8, "7.5" to 4.1, "10" to 4.3),
            "C" to mapOf("5" to 3.9, "7.5" to 4.2, "10" to 4.4)
        ),

        // ── ГРУППА 4: Прыжки внутрь (Inward) ────────────────────────
        "401" to mapOf(
            "A" to mapOf("1" to 1.5, "3" to 1.8, "5" to 1.9),
            "B" to mapOf("1" to 1.4, "3" to 1.7, "5" to 1.8),
            "C" to mapOf("1" to 1.3, "3" to 1.6, "5" to 1.7)
        ),
        "402" to mapOf(
            "A" to mapOf("1" to 1.7, "3" to 1.9),
            "B" to mapOf("1" to 1.6, "3" to 1.8),
            "C" to mapOf("1" to 1.5, "3" to 1.7)
        ),
        "403" to mapOf(
            "B" to mapOf("1" to 2.2, "3" to 2.2, "5" to 2.2, "7.5" to 2.3, "10" to 2.4),
            "C" to mapOf("1" to 2.2, "3" to 2.2, "5" to 2.2, "7.5" to 2.3, "10" to 2.4)
        ),
        "404" to mapOf(
            "B" to mapOf("3" to 2.6, "5" to 2.7, "7.5" to 2.9, "10" to 3.1),
            "C" to mapOf("3" to 2.7, "5" to 2.8, "7.5" to 3.0, "10" to 3.2)
        ),
        "405" to mapOf(
            "B" to mapOf("3" to 3.1, "5" to 3.3, "7.5" to 3.5, "10" to 3.7),
            "C" to mapOf("3" to 3.4, "5" to 3.5, "7.5" to 3.7, "10" to 3.9)
        ),
        "406" to mapOf(
            "B" to mapOf("5" to 3.6, "7.5" to 3.9, "10" to 4.1),
            "C" to mapOf("5" to 3.6, "7.5" to 4.0, "10" to 4.2)
        ),

        // ── ГРУППА 5: Прыжки с винтами ───────────────────────────────
        // Код: 5[направление][полуобороты][полувинты]
        // Направление: 1=вперёд, 2=назад, 3=оборот назад, 4=внутрь
        "5111" to mapOf("A" to mapOf("1" to 1.6, "3" to 1.8)),
        "5112" to mapOf("A" to mapOf("1" to 1.8, "3" to 2.0)),
        "5113" to mapOf("A" to mapOf("1" to 2.3, "3" to 2.5)),
        "5114" to mapOf("A" to mapOf("1" to 2.6, "3" to 2.7)),
        "5121" to mapOf("D" to mapOf("1" to 1.9, "3" to 2.0)),
        "5122" to mapOf("D" to mapOf("1" to 2.1, "3" to 2.2)),
        "5124" to mapOf("D" to mapOf("1" to 2.4, "3" to 2.5)),
        "5126" to mapOf("D" to mapOf("1" to 2.8, "3" to 2.9)),
        "5131" to mapOf("D" to mapOf("3" to 2.2, "5" to 2.3)),
        "5132" to mapOf("D" to mapOf("3" to 2.5, "5" to 2.5)),
        "5134" to mapOf("D" to mapOf("3" to 2.9, "5" to 3.0)),
        "5136" to mapOf("D" to mapOf("3" to 3.3, "5" to 3.4)),
        "5138" to mapOf("D" to mapOf("5" to 3.8, "7.5" to 4.0)),
        "5152" to mapOf(
            "B" to mapOf("3" to 2.9, "5" to 3.0),
            "D" to mapOf("3" to 2.9, "5" to 3.0)
        ),
        "5154" to mapOf("D" to mapOf("3" to 3.3, "5" to 3.5)),
        "5156" to mapOf("D" to mapOf("3" to 3.8, "5" to 4.0)),

        "5211" to mapOf("A" to mapOf("1" to 1.8, "3" to 2.0)),
        "5212" to mapOf("A" to mapOf("1" to 2.0, "3" to 2.1)),
        "5221" to mapOf("D" to mapOf("1" to 2.0, "3" to 2.1)),
        "5222" to mapOf("D" to mapOf("1" to 2.2, "3" to 2.3)),
        "5223" to mapOf("D" to mapOf("1" to 2.5, "3" to 2.5)),
        "5225" to mapOf("D" to mapOf("1" to 3.0, "3" to 3.0)),
        "5227" to mapOf("D" to mapOf("1" to 3.4, "3" to 3.5)),
        "5231" to mapOf("D" to mapOf("3" to 2.5, "5" to 2.5)),
        "5233" to mapOf("D" to mapOf("3" to 2.9, "5" to 3.0)),
        "5235" to mapOf("D" to mapOf("3" to 3.3, "5" to 3.4)),
        "5237" to mapOf("D" to mapOf("5" to 3.8, "7.5" to 4.0)),
        "5251" to mapOf("D" to mapOf("3" to 3.0, "5" to 3.2)),
        "5253" to mapOf("D" to mapOf("3" to 3.3, "5" to 3.5)),
        "5255" to mapOf("D" to mapOf("3" to 3.7, "5" to 3.9)),

        "5311" to mapOf("A" to mapOf("1" to 2.0, "3" to 2.2)),
        "5312" to mapOf("A" to mapOf("1" to 2.1, "3" to 2.2)),
        "5321" to mapOf("D" to mapOf("1" to 2.1, "3" to 2.2)),
        "5322" to mapOf("D" to mapOf("1" to 2.3, "3" to 2.4)),
        "5323" to mapOf("D" to mapOf("1" to 2.6, "3" to 2.6)),
        "5325" to mapOf("D" to mapOf("1" to 3.0, "3" to 3.1)),
        "5327" to mapOf("D" to mapOf("1" to 3.5, "3" to 3.6)),
        "5331" to mapOf("D" to mapOf("3" to 2.6, "5" to 2.7)),
        "5333" to mapOf("D" to mapOf("3" to 3.1, "5" to 3.1)),
        "5335" to mapOf("D" to mapOf("3" to 3.5, "5" to 3.6)),
        "5337" to mapOf("D" to mapOf("5" to 4.0, "7.5" to 4.2)),

        "5411" to mapOf("A" to mapOf("1" to 2.0, "3" to 2.2)),
        "5412" to mapOf("A" to mapOf("1" to 2.2, "3" to 2.4)),
        "5421" to mapOf("D" to mapOf("1" to 2.1, "3" to 2.3)),
        "5422" to mapOf("D" to mapOf("1" to 2.4, "3" to 2.5)),
        "5431" to mapOf("D" to mapOf("3" to 2.6, "5" to 2.7)),
        "5432" to mapOf("D" to mapOf("3" to 3.0, "5" to 3.1)),
        "5434" to mapOf("D" to mapOf("3" to 3.4, "5" to 3.5)),

        // ── ГРУППА 6: Прыжки из стойки (только вышка) ────────────────
        "612" to mapOf(
            "B" to mapOf("5" to 1.9, "7.5" to 2.0, "10" to 2.1),
            "C" to mapOf("5" to 1.9, "7.5" to 2.0, "10" to 2.1)
        ),
        "614" to mapOf(
            "B" to mapOf("5" to 2.1, "7.5" to 2.2, "10" to 2.3),
            "C" to mapOf("5" to 2.1, "7.5" to 2.2, "10" to 2.3)
        ),
        "615" to mapOf(
            "B" to mapOf("5" to 2.6, "7.5" to 2.9, "10" to 3.1),
            "C" to mapOf("5" to 2.8, "7.5" to 3.1, "10" to 3.3)
        ),
        "616" to mapOf(
            "B" to mapOf("5" to 3.1, "7.5" to 3.4, "10" to 3.6),
            "C" to mapOf("5" to 3.2, "7.5" to 3.5, "10" to 3.7)
        ),
        "622" to mapOf(
            "B" to mapOf("5" to 2.0, "7.5" to 2.1, "10" to 2.2),
            "C" to mapOf("5" to 2.0, "7.5" to 2.1, "10" to 2.2)
        ),
        "624" to mapOf(
            "B" to mapOf("5" to 2.3, "7.5" to 2.5, "10" to 2.6),
            "C" to mapOf("5" to 2.3, "7.5" to 2.5, "10" to 2.6)
        ),
        "625" to mapOf(
            "B" to mapOf("5" to 2.9, "7.5" to 3.2, "10" to 3.4),
            "C" to mapOf("5" to 3.0, "7.5" to 3.3, "10" to 3.5)
        ),
        "626" to mapOf(
            "B" to mapOf("5" to 3.4, "7.5" to 3.7, "10" to 3.9),
            "C" to mapOf("5" to 3.4, "7.5" to 3.8, "10" to 4.0)
        )
    )
}
