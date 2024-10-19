package com.example.firstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btndivision: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Add this to set the layout

        btnAdd = findViewById(R.id.btn_add)
        btnSubtract = findViewById(R.id.btn_subtract)
        btnMultiply = findViewById(R.id.btn_multiply)
        btndivision = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        // Sets the  listeners for the different buttons
        btnAdd.setOnClickListener(this)
        btnSubtract.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btndivision.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        val a = etA.text.toString().toDoubleOrNull()
        val b = etB.text.toString().toDoubleOrNull()

        if (a == null || b == null) {
            resultTv.text = "Please enter valid numbers"
            return
        }

        var result: Double = 0.0
        when (v?.id) {
            R.id.btn_add -> result = a + b
            R.id.btn_subtract -> result = a - b
            R.id.btn_multiply -> result = a * b
            R.id.btn_division -> {
                if (b != 0.0) {
                    result = a / b
                } else {
                    resultTv.text = "Cannot divide by zero"
                    return
                }
            }
        }

        resultTv.text = "Result is $result"
    }
}
