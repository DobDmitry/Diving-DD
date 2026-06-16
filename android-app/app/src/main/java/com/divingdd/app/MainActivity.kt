package com.divingdd.app

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButtonToggleGroup
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var codeInput: TextInputEditText
    private lateinit var positionToggle: MaterialButtonToggleGroup
    private lateinit var heightToggle: MaterialButtonToggleGroup
    private lateinit var resultText: TextView

    private val heightById = mapOf(
        R.id.btnH1 to "1",
        R.id.btnH3 to "3",
        R.id.btnH5 to "5",
        R.id.btnH75 to "7.5",
        R.id.btnH10 to "10",
    )

    private val positionById = mapOf(
        R.id.btnPosA to "A",
        R.id.btnPosB to "B",
        R.id.btnPosC to "C",
        R.id.btnPosD to "D",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        codeInput = findViewById(R.id.codeInput)
        positionToggle = findViewById(R.id.positionToggle)
        heightToggle = findViewById(R.id.heightToggle)
        resultText = findViewById(R.id.resultText)

        codeInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) = recalculate()
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        positionToggle.addOnButtonCheckedListener { _, _, _ -> recalculate() }
        heightToggle.addOnButtonCheckedListener { _, _, _ -> recalculate() }
    }

    private fun recalculate() {
        val code = codeInput.text.toString().trim()
        val positionId = positionToggle.checkedButtonId
        val heightId = heightToggle.checkedButtonId

        if (code.isEmpty() && positionId == -1 && heightId == -1) {
            showPlaceholder()
            return
        }

        if (code.isEmpty() || !code.all { it.isDigit() }) {
            showHint("Введите корректный номер прыжка")
            return
        }

        if (positionId == -1) {
            showHint("Выберите положение")
            return
        }

        if (heightId == -1) {
            showHint("Выберите высоту")
            return
        }

        val position = positionById[positionId]!!
        val height = heightById[heightId]!!

        val positionsMap = DiveTable.table[code]
        if (positionsMap == null) {
            showError("Прыжок $code не найден в таблице КТ")
            return
        }

        val heightsMap = positionsMap[position]
        if (heightsMap == null) {
            val available = positionsMap.keys.sorted().joinToString(", ")
            showError("Прыжок $code: положение $position не предусмотрено\nДоступные: $available")
            return
        }

        val dd = heightsMap[height]
        if (dd == null) {
            val available = heightsMap.keys.sortedBy { it.toDouble() }.joinToString(", ")
            showError("Прыжок $code$position: высота $height м не предусмотрена\nДоступные: $available м")
            return
        }

        showResult("КТ = $dd")
    }

    private fun showPlaceholder() {
        resultText.text = "Введите номер, положение и высоту"
        resultText.setTextColor(ContextCompat.getColor(this, R.color.text_secondary))
        resultText.textSize = 16f
    }

    private fun showHint(message: String) {
        resultText.text = message
        resultText.setTextColor(ContextCompat.getColor(this, R.color.text_secondary))
        resultText.textSize = 16f
    }

    private fun showError(message: String) {
        resultText.text = message
        resultText.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
        resultText.textSize = 15f
    }

    private fun showResult(text: String) {
        resultText.text = text
        resultText.setTextColor(ContextCompat.getColor(this, R.color.diving_accent))
        resultText.textSize = 28f
    }
}
