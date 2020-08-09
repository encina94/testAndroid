package com.example.kotlintest

class VampireKing(name: String):Vampyre(name) {
    //Con el init se puede modificar los valores que vienen por default de la superclase
    init{
        hitPoints = 140

    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage)
    }
}