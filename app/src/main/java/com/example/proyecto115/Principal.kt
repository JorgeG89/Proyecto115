package com.example.proyecto115

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Principal : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Trabajo de Jorge Mañas Garcia
        //Trabajo ligeramente modificado

        val boton = findViewById<Button>(R.id.button)

        val textoVal1 = findViewById<TextView>(R.id.textNum1)

        val resultado = findViewById<TextView>(R.id.textoResultado)

        textoVal1.setText("Iniciar programa")

        boton.setOnClickListener {
            val alumno1 = Alumno("Ana", 7)
            val alumno2 = Alumno("Carlos", 2)

            resultado.text=(alumno1.imprimir()+"\n")
            resultado.append(alumno1.mostrarEstado()+"\n")
            resultado.append(alumno2.imprimir()+"\n")
            resultado.append(alumno2.mostrarEstado()+"\n")
            }
        }
    }

class Alumno (val nombre: String, val nota: Int){
    fun imprimir(): String {
        var texto : String
        texto =("Alumno: $nombre tiene una nota de $nota")
        return texto
    }
    fun mostrarEstado (): String {
        var texto : String
        if (nota >= 4)
            texto=("$nombre se encuentra en estado REGULAR")
        else
            texto=("$nombre no está REGULAR")
        return texto
    }
}