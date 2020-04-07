package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        constAndVariables()
        maps()
        loops()
        nullSafety()
        println(sumTwoNumber(2,4))
        createObject()
    }
    private fun constAndVariables(){
        //Variable
        var pruebaVariable = "Hola"

        //Constante
        val pruebaConstante = "Mi primer constante"
    }

    private fun tiposDeDatos(){
        //String
        //Especificarle el tipo con ":Objeto" o simplemente te lo toma automatico
        val myString:String = "Hola perro"

        val myString2 = "Hola perrito"

        //Double
        val myDouble: Double = 1.5

        //Float
        val myFloat:Float = 1.5f

        //Boolean
        val myBool:Boolean = true
        val myBool2 = false
    }

    //Es lo mismo que en java
    private fun sentenciaIf(){
        val myNumber = 10
        if(myNumber.equals(10)){
            println("$myNumber es menor que 10 ")
        }

    }

    private fun sentenciaWhen(){
        val country = "Argentina"

        //Cuando country coincida con "Argentina", entonces realiza una accion
        //Es similar a un switch, inclusive con el el default cambiandolo por else
        when(country){
            "Argentina" -> {
            println("El idioma es argentino")
            }
            "Francia" -> {
                println("El idioma es frances")
            }
            "España" -> {
                println("El idioma es español")
            }
            else -> {
                println("no es ninguno")
            }
        }

        val age = 10

        //in determina un rango, 0..2 entre 0 y 2 inclusive, y asi
        when(age){
            in 0..2 ->{
                println("es menor")
            }
            in 3..10 -> {
                println("es mayor")
            }
            else -> {
                println("no es ninguno")
            }

        }

    }

    private fun arrays(){
        val  name = "brian"
        val company = "bayer"

        val myArray = arrayListOf<String>()

        myArray.add(name)
        myArray.add(company)
        myArray.add(name)
        println(myArray)

        myArray.addAll(listOf("Hola","Bienvenidos al tutorual"))
        println(myArray)

        //Acceso a datos
        val myCompany = myArray[2]

        //Modificacion de datos
        myArray[5] = "Modificado compañia"
        println(myArray)

        //Eliminar datos
        myArray.removeAt(5)

        //it es el objeto que va tomando en cada iteracion del array
        myArray.forEach{
            println(it)
        }
    }

    //Se definen mapas en kotlin
    fun maps(){

        //Mapa Clave, Valor
        var myMap:Map<String,Int> = mapOf()
        println(myMap)

        myMap = mutableMapOf("Seba" to 1, "Pedro" to 2)
        val valor =  myMap.get("Seba")
        println(valor)

        //Añadir de a un elemento
        myMap["Ana"] = 7
        myMap.put("Maria",8)
        println(myMap)

        //Actualizar un dato
        myMap.put("Seba",10)
        myMap["Seba"] = 15

        //Eliminar un dato
        myMap.remove("Seba")

    }

    private fun loops(){
        //Bucles

        val myArray:List<String> = listOf("Hola", "blabla","gluglu")
        val myMap:MutableMap<String,Int> = mutableMapOf("Seba" to 1, "ana " to 2)

        for(objeto in myArray){
            println(objeto)
        }

        //En un rango recorre de 2 en 2
        for(x in 0..10 step 2){
            println(x)
        }

        //En un rango arranca recorriendo del mas alto hacia abajo (cero) de 2 en 2
        for(x in 0 downTo 10 step 2){
            println(x)
        }

        //While

        var x = 0

        while(x < 10){
            println(x)
            x++
        }



    }

    fun nullSafety(){
        //Permite que un valor String pueda ser null
        var myString: String? = "Seba"

        //Si se le asigno que podia ser null cuando uso alguna propiedad o lo uso como parametro
        //Siempre tengo que agregarle el ? porque sino da nullPointer
        println(myString?.length)

        myString = null

        //Con el let se ejecuta una porcion de codigo cuando el valor es null
        //Con el run se corre cuando no es null
        myString?.let {
            println(it)
        }.run {
            println(myString)
        }

    }

    //Como establecer funciones
    fun sumTwoNumber(firstNumber: Int,secondNumber: Int): String{
        val result = firstNumber+secondNumber
        return "El valor final es $result"
    }

    fun createObject(){
        val objectTest = Test("seba",15,arrayOf("Mario","Jose"))
        val valor = objectTest.ageString(12)
        println(valor)
    }


}

