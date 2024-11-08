package com.example.firstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var btnAdd : Button
    lateinit var btnSubtract : Button
    lateinit var btnMultiply : Button
    lateinit var btndivision : Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv: TextView

    /* initialised all of the variables above */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnAdd = findViewById(R.id.btn_add)
        btnSubtract = findViewById(R.id.btn_subtract)
        btnMultiply = findViewById(R.id.btn_multiply)
        btndivision = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b =etB.text.toString().toDouble()
        var result : 0.0
        when(v? = id) {
            R.id.btn_add ;{

                result = a+b

        }

            R.id.btn_subtract ;{
            result = a-b

        }
            R.id.btn_multiply ;{
            result = a*b

        }
            R.id.btn_division ;{
            result = a/b

        }

        }
        resultTv.text = "Result is $result"
    }

}

