package com.example.kotlinpoo

/*
private -> Vísivel apenas dentro da classe
protected -> funciona como o private, mas é visível em subclasses
public -> Vísivel em qualquer lugar, caso não seja definido é o padrão
internal -> Lembra o public, mas sua visibilidade é restringida ao módulo,
sendo então visível dentro de um mesmo módulo

*/

fun main(){
 val animal1 = Animal1()
    println(animal1.nome)
}

open class Animal1(){

    var nome = "marley"

    fun dormir(){
        println("Dormir")
    }
}

class Cao1 : Animal1(){
    fun exibirNome(){
        println("Metodo exibir nome: $nome")
    }
}
