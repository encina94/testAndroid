package com.example.kotlintest


//La subClase debe recibir los mismos parametros que la superClase debido a que esta
//tiene un constructor donde se le deben enviar parametros para setear valores
//Los valores que se le ingresan son enviados a la superclase (algo asi como super en java)

//O en toddo caso setearle valores por default
//TrollSubClass(name:String): EnemayInheret(name,20,17)

class TrollSubClass(name:String, hitpoints:Int, lives:Int): EnemyInheret(name,hitpoints,lives) {

}