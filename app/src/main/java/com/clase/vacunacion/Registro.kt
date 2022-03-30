package com.clase.vacunacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro)

        val buttonRegistro = findViewById<Button>(R.id.RegistrarseFinal)
        buttonRegistro.setOnClickListener{
            startActivity(Intent(this, RegistroExitoso::class.java))
        }
    }
}