package com.divingdd.app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val codeInput = findViewById<TextInputEditText>(R.id.codeInput)
        val positionChipGroup = findViewById<ChipGroup>(R.id.positionChipGroup)
        val heightChipGroup = findViewById<ChipGroup>(R.id.heightChipGroup)
        val resultText = findViewById<TextView>(R.id.resultText)
        val calcButton = findViewById<MaterialButton>(R.id.calcButton)

        val heightByChipId = mapOf(
            R.id.chipHeight1 to "1",
            R.id.chipHeight3 to "3",
            R.id.chipHeight5 to "5",
            R.id.chipHeight75 to "7.5",
            R.id.chipHeight10 to "10",
        )

        calcButton.setOnClickListener {
            val code = codeInput.text.toString().trim()

            if (code.isEmpty() || !code.all { it.isDigit() }) {
                showResult(resultText, "Введите код прыжка (например 403).", isError = true)
                return@setOnClickListener
            }

            val positionChipId = positionChipGroup.checkedChipId
            if (positionChipId == -1) {
                showResult(resultText, "Выберите положение прыжка.", isError = true)
                return@setOnClickListener
            }

            val heightChipId = heightChipGroup.checkedChipId
            if (heightChipId == -1) {
                showResult(resultText, "Выберите высоту.", isError = true)
                return@setOnClickListener
            }

            val position = findViewById<Chip>(positionChipId).text.toString()
            val height = heightByChipId[heightChipId]!!

            val positionsMap = DiveTable.table[code]
            if (positionsMap == null) {
                showResult(resultText, "Прыжок $code не найден в таблице КТ.", isError = true)
                return@setOnClickListener
            }

            val heightsMap = positionsMap[position]
            if (heightsMap == null) {
                val available = positionsMap.keys.sorted().joinToString(", ")
                showResult(
                    resultText,
                    "Прыжок $code: положение $position не предусмотрено.\nДоступные: $available",
                    isError = true,
                )
                return@setOnClickListener
            }

            val dd = heightsMap[height]
            if (dd == null) {
                val available = heightsMap.keys.sortedBy { it.toDouble() }.joinToString(", ")
                showResult(
                    resultText,
                    "Прыжок $code$position: высота $height м не предусмотрена.\nДоступные: $available м",
                    isError = true,
                )
                return@setOnClickListener
            }

            showResult(resultText, "КТ = $dd", isError = false)
        }
    }

    private fun showResult(resultText: TextView, text: String, isError: Boolean) {
        resultText.text = text
        val colorRes = if (isError) android.R.color.holo_red_dark else R.color.diving_accent
        resultText.setTextColor(ContextCompat.getColor(this, colorRes))
    }
}
