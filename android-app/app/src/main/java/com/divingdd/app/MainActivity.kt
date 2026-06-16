package com.divingdd.app

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton
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

    private val positionBtnIds = mapOf(
        "A" to R.id.btnPosA,
        "B" to R.id.btnPosB,
        "C" to R.id.btnPosC,
        "D" to R.id.btnPosD,
    )

    private val heightBtnIds = mapOf(
        "1" to R.id.btnH1,
        "3" to R.id.btnH3,
        "5" to R.id.btnH5,
        "7.5" to R.id.btnH75,
        "10" to R.id.btnH10,
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
            enableAllButtons()
            showPlaceholder()
            return
        }

        if (code.isEmpty() || !code.all { it.isDigit() }) {
            enableAllButtons()
            showHint("Введите корректный номер прыжка")
            return
        }

        val positionsMap = DiveTable.table[code]
        if (positionsMap == null) {
            enableAllButtons()
            showError("Прыжок $code не найден в таблице КТ")
            return
        }

        updateAvailability(positionsMap)

        val checkedPosId = positionToggle.checkedButtonId
        if (checkedPosId == -1) {
            showHint("Выберите положение")
            return
        }

        val position = positionById[checkedPosId]!!
        val checkedHeightId = heightToggle.checkedButtonId
        if (checkedHeightId == -1) {
            showHint("Выберите высоту")
            return
        }

        val height = heightById[checkedHeightId]!!
        val dd = positionsMap[position]?.get(height)
        if (dd == null) {
            showHint("Выберите высоту")
            return
        }

        showResult("КТ = $dd")
    }

    private fun updateAvailability(positionsMap: Map<String, Map<String, Double>>) {
        positionBtnIds.forEach { (pos, btnId) ->
            val btn = findViewById<MaterialButton>(btnId)
            val available = positionsMap.containsKey(pos)
            if (!available && positionToggle.checkedButtonId == btnId) {
                positionToggle.clearChecked()
            }
            btn.isEnabled = available
        }

        val checkedPosId = positionToggle.checkedButtonId
        val position = if (checkedPosId != -1) positionById[checkedPosId] else null
        val heightsMap = if (position != null) positionsMap[position] else null

        heightBtnIds.forEach { (h, btnId) ->
            val btn = findViewById<MaterialButton>(btnId)
            val available = heightsMap?.containsKey(h) == true
            if (!available && heightToggle.checkedButtonId == btnId) {
                heightToggle.clearChecked()
            }
            btn.isEnabled = available
        }
    }

    private fun enableAllButtons() {
        positionBtnIds.values.forEach { btnId ->
            findViewById<MaterialButton>(btnId).isEnabled = true
        }
        heightBtnIds.values.forEach { btnId ->
            findViewById<MaterialButton>(btnId).isEnabled = true
        }
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
