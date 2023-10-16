package com.example.ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

private const val TAG = "EJERCICIO5"
private var texto = "";

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val string = getString(R.string.string_name)
        val txtNombre = findViewById<TextView>(R.id.txt_saludo)
        txtNombre.text="Hola Darío"
        texto = "Texto en onCreate()"
        println("Mi nombre es $string")
        Toast.makeText(this, "Mi nombre es $string", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        texto = "Texto en onStart()"
        Log.d(TAG, "Se llama después de onCreate(). Darío, muestro la pantalla. El usuario aún no puede interaccionar")
        var claseA = ClaseA()
        claseA.atrib1 = 5
        claseA.atrib2 = "Soy Darío"
        claseA.atrib3 = 'o'
        Toast.makeText(this, claseA.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        texto = "Texto en onResume()"
        Log.d(TAG, "El usuario ya puede interaccionar con la pantalla")
    }

    override fun onPause() {
        super.onPause()
        texto = "Texto en onPause()"
        Log.d(TAG, "Pierdo el foco de la pantalla. Botón home.")
    }

    override fun onRestart() {
        super.onRestart()
        texto = "Texto en onRestart()"
        Log.d(TAG, "Vuelvo a estar visible para Darío")
    }

    override fun onStop() {
        super.onStop()
        texto = "Texto en onStop()"
        Log.d(TAG, "Dejo de estar visible para el usuario. Otra app, S.O.")
    }

    override fun onDestroy() {
        super.onDestroy()
        texto = "Texto en onDestroy()"
        Log.d(TAG, "La actividad muere")
    }
}

private class ClaseA() {
    var atrib1 : Int = 1
         set(valor) {
            field = valor
        }
    var atrib2 : String = "Atributo 2"
        set(valor) {
            field = valor
        }
    var atrib3 : Char = 'h'
        set(valor) {
            field = valor
        }

    constructor(atrib1 : Int, atrib2 : String, atrib3 : Char) : this() {
        this.atrib1 = atrib1
        this.atrib2 = atrib2
        this.atrib3 = atrib3
    }

    override fun toString() : String {
        return "$atrib1,$atrib2,$atrib3"
    }
}