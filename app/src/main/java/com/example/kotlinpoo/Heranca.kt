package com.example.kotlinpoo

fun main(){
    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()

    val passaro = Passaro()
    passaro.correr()
    passaro.dormir()



}

open class Animal{

    //Metodos
    open fun dormir(){
        println("dormir")
    }

    fun correr(){
        println("correr")
    }
}

class Cao: Animal(){

    //SOBREESCREVENDO A CLASSE PAI ANIMAL
    override fun dormir(){
        //CHAMANDO O METODO DA CLASSE PAI
        super.dormir()
        println("como um cao")
    }

    fun latir(){
        println("Latir")
    }
}

class Passaro: Animal(){

}