package com.example.kotlinpoo

fun main(args: Array<String>){
   //seria o switch - case de outras linguagens

    var opcao = 2

    when (opcao){
        1 -> {
            println("cafe com leite ")
            println("cafe com leite ")
            println("cafe com leite ")
        }
        2 -> println("chocolate quente")
        else -> println("nenhuma opcao selecionada")
    }

}