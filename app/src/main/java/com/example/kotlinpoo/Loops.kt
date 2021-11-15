package com.example.kotlinpoo

fun main(args: Array<String>){

    /*var numero = 1
    while (numero < 5){
        println("Executando")
        numero++
    }*/

    /*for(numero in 1..5){
        println("Executando: $numero")
    }*/

    var postagens = arrayOf(
       "Descoberto novo metodo de tratamento para Diabetes",
        "Novo curso de Andoid foi lançado",
        "Bolsa de valores opera em alta de 2%",
        "------------------------------------",
        "Descoberto novo metodo de tratamento para Diabetes",
        "Novo curso de Andoid foi lançado",
        "Bolsa de valores opera em alta de 2%"
    )

    for((indice, postagem) in postagens.withIndex()){
      println("$indice - $postagem")
    }
}