package com.hobbydev.findmyage

import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etDOB: EditText
    private lateinit var tvShowAge: TextView
    private lateinit var buFindAge: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }
    private fun initComponents() {
        etDOB = findViewById(R.id.etDOB)
        tvShowAge = findViewById(R.id.tvShowAge)
        buFindAge = findViewById(R.id.buFindAge)
    }
    private fun initListeners() {
        buFindAge.setOnClickListener {
            //val result = calculateIMC()
            findAge()
        }
    }

    private fun findAge(){
        val dob = etDOB.text.toString()
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val age = year - dob.toInt()
        val ageString = age.toString()
        tvShowAge.text = ("your age is:"+ageString+" and in month"+ age*12+", in days"+age*365)

    }
}