package com.clase.vacunacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class RegistroExitoso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro_exitoso)

        val backButton = findViewById<ImageButton>(R.id.BackButton3)
        backButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}