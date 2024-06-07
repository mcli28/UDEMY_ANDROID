package com.hobbydev.calculatordemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var etn1:EditText
    private lateinit var etn2:EditText
    private lateinit var tvResult:TextView
    private lateinit var buSum:Button

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var button:Button

    val username = "admin"
    val password = "1111"
    val name = "limber mancilla"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListeners()
    }

    private fun initComponents() {
        etn1 = findViewById(R.id.etn1)
        etn2 = findViewById(R.id.etn2)
        tvResult = findViewById(R.id.tvResult)
        buSum  = findViewById(R.id.buSum)

        etUsername  = findViewById(R.id.etUsername)
        etPassword  = findViewById(R.id.etPassword)
        button  = findViewById(R.id.button)
    }

    private fun initListeners() {
        buSum.setOnClickListener {
            calculateSum()
        }

        button.setOnClickListener {
            loginFun()
        }
    }

    private fun loginFun(){
        if (username.equals(etUsername.text.toString()) &&
            password.equals(etPassword.text.toString())){
            val intent = Intent(this, Home::class.java)
            intent.putExtra("name", name)
            intent.putExtra("username", username)
            startActivity(intent)
        }
    }

    private fun calculateSum(){
        val n1 = etn1.text.toString().toInt()
        val n2 = etn2.text.toString().toInt()
        val sum =  n1 + n2
        tvResult.text = sum.toString()
    }


    /*public fun buClick(view: View) {
        val n1 = etn1.hint
        val n2 = etn2.hint
        val sum = n1 + n2
        tvResult.text = sum
    }*/
}