package com.hobbydev.calculatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Home : AppCompatActivity() {
    private lateinit var tvShow: TextView
    private lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show()
        val nombre = intent.extras?.getString("name").toString()
        //val nombre = intent.extras.getString("name")
        val usuario = intent.extras?.getString("username").toString()
        initComponents()
        initUI(nombre, usuario)
        initListeners()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show()
    }

    private fun initUI(nombre: String, usuario: String){
        tvShow.text = nombre
    }

    private fun initComponents() {
        tvShow  = findViewById(R.id.tvShow)
        button2  = findViewById(R.id.button2)
    }

    private fun initListeners() {
        button2.setOnClickListener {
            finish()
        }
    }
}