package com.example.kotlinpoo

fun main(){
    exibirMensagem("davi", 22)
    var resultado = somar(20,5)
    println(resultado)
}

fun exibirMensagem(nome: String, idade: Int){
    println("Alerta, voce não preencheu todos os dados, $nome idade $idade")
}

fun somar(numero1: Int, numero2: Int) : Int{
    var total = numero1 + numero2
    return total
}