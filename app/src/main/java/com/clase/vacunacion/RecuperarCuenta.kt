package com.clase.vacunacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class RecuperarCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recuperar_cuenta)

        val BackButton = findViewById(R.id.BackButton) as ImageButton
        BackButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}