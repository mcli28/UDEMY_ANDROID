package com.hobbydev.simplecalculator

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var tvResult: TextView
    private lateinit var etn1: EditText
    private lateinit var etn2: EditText
    private lateinit var buSum: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }

    private fun initComponents(){
        etn1 = findViewById(R.id.etn1)
        etn2 = findViewById(R.id.etn2)
        tvResult = findViewById(R.id.tvResult)
        buSum = findViewById(R.id.buSum)
    }

    private fun initListeners() {
        buSum.setOnClickListener {
            val n1 = etn1.text.toString().toDouble()
            val n2 = etn2.text.toString().toDouble()
            val r = n1 + n2
            tvResult.text = "la suma es "+r.toString()
            Log.i("lix", n1.toString())
            Log.i("lix", n2.toString())
        }
    }

}