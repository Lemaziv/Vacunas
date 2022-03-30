package com.clase.vacunacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class PreRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pre_registro)

        val comenzar = findViewById<Button>(R.id.registrarseFormulario)
        comenzar.setOnClickListener{
            startActivity(Intent(this, Registro::class.java))
        }

        val backButton = findViewById<ImageButton>(R.id.BackButton2)
        backButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}