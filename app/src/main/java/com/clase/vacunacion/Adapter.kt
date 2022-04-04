package com.clase.vacunacion

import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.clase.vacunacion.Publicacion

class Adapter(val publicacionList: ArrayList<Publicacion>) : RecyclerView.Adapter<Adapter.ViewHolder>(){

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindItems(publicacion: Publicacion){
            val nombre = itemView.findViewById(R.id.nombre) as TextView
            val usuario = itemView.findViewById(R.id.usuario) as TextView
            val likes = itemView.findViewById(R.id.likes) as TextView
            val coments = itemView.findViewById(R.id.coments) as TextView
            val texto = itemView.findViewById(R.id.texto) as TextView

            nombre.text = publicacion.nombre.toString()
            usuario.text = publicacion.usuario.toString()
            likes.text = publicacion.likes.toString()
            coments.text = publicacion.comentarios.toString()
            texto.text = publicacion.texto.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publicacion, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(publicacionList[position])
    }

    override fun getItemCount(): Int {
        return publicacionList.size
    }
}