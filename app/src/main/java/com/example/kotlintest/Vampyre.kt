package com.example.kotlintest

open class Vampyre(name:String): EnemyInheret(name,15,10){

    //Sobreescribo la funcion del padre, con el super llamo a la funcion del padre pero
    //le envio un nuevo parametro
    override fun takeDamage(damage: Int ){
            super.takeDamage(damage/2)
    }
}