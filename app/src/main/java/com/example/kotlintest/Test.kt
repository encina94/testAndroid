package com.example.kotlintest

class Test(val name:String, var age:Int,val languages: Array<String>) {


    fun ageString(age:Int):String{
        return("La edad es ${age+this.age}")
    }
}