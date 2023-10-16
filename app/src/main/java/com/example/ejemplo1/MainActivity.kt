package com.example.ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val string = getString(R.string.string_name)
        val txtNombre = findViewById<TextView>(R.id.txt_saludo)
        txtNombre.text="Hola Darío"
        println("Mi nombre es $string")
        Toast.makeText(this, "Mi nombre es $string", Toast.LENGTH_LONG).show()
    }
}