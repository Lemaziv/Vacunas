package com.clase.vacunacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.registro.*

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registro)

        RegistrarseFinal.setOnClickListener{
            if (CorreoRegistro.text.isNotEmpty() && ContraseñaRegistro.text.isNotEmpty()){
                FirebaseAuth.getInstance()
                    .createUserWithEmailAndPassword(CorreoRegistro.text.toString(),
                    ContraseñaRegistro.text.toString()).addOnCompleteListener {
                        if(it.isSuccessful){
                            startActivity(Intent(this, RegistroExitoso::class.java))
                        } else {
                            showAlert()
                        }
                    }
            } else {
                showAlert()
            }
        }
    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error autenticando al usuario")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}