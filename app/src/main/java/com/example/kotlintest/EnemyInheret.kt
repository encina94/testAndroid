package com.example.kotlintest

//Se coloca open para que la clase pueda ser heredada  (ser una superclase) por otras
//clases (subclases)
open class EnemyInheret(val name:String, var hitPoints: Int, var lives: Int) {

    //Open en funciones permite que las mismas puedan ser sobreescritas por las subclases
    open fun takeDamage(damage: Int ){
        val reaminingHitpoints = hitPoints - damage
        if(reaminingHitpoints > 0){
            hitPoints = reaminingHitpoints
            println("$name took $damage points of damage, and has $hitPoints left")
        }else{
            lives-= 1
            println("$name lost a life")
        }
    }


}