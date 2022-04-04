package com.clase.vacunacion

data class Publicacion(val nombre:String?, val usuario:String?, val likes:String?, val comentarios:String?, val texto:String?)
{
    constructor():this(null,null,null,null,null)
}