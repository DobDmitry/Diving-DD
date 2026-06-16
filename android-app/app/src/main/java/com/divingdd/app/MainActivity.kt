package com.divingdd.app

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val codeInput = findViewById<EditText>(R.id.codeInput)
        val positionSpinner = findViewById<Spinner>(R.id.positionSpinner)
        val heightSpinner = findViewById<Spinner>(R.id.heightSpinner)
        val resultText = findViewById<TextView>(R.id.resultText)
        val calcButton = findViewById<Button>(R.id.calcButton)

        val positions = listOf("A", "B", "C", "D")
        positionSpinner.adapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, positions)

        val heights = listOf("1", "3", "5", "7.5", "10")
        heightSpinner.adapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, heights)

        calcButton.setOnClickListener {
            val code = codeInput.text.toString().trim()
            val position = positionSpinner.selectedItem as String
            val height = heightSpinner.selectedItem as String

            if (code.isEmpty() || !code.all { it.isDigit() }) {
                resultText.text = "Введите код прыжка (например 403)."
                return@setOnClickListener
            }

            val positionsMap = DiveTable.table[code]
            if (positionsMap == null) {
                resultText.text = "Прыжок $code не найден в таблице КТ."
                return@setOnClickListener
            }

            val heightsMap = positionsMap[position]
            if (heightsMap == null) {
                val available = positionsMap.keys.sorted().joinToString(", ")
                resultText.text =
                    "Прыжок $code: положение $position не предусмотрено.\nДоступные: $available"
                return@setOnClickListener
            }

            val dd = heightsMap[height]
            if (dd == null) {
                val available = heightsMap.keys.sortedBy { it.toDouble() }.joinToString(", ")
                resultText.text =
                    "Прыжок $code$position: высота $height м не предусмотрена.\nДоступные: $available м"
                return@setOnClickListener
            }

            resultText.text = "КТ = $dd"
        }
    }
}
