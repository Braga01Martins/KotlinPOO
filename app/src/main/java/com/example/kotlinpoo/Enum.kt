package com.example.kotlinpoo
/*
Enum (Enumeração) -> é um tipo de dados
** que consiste em um conjunto de constantes.
 */

enum class StatusPedido{
    PROCESSANDO, APROVADO, REPROVADO
}

class Pedido{

    var status: StatusPedido = StatusPedido.PROCESSANDO
}


fun main(args: Array<String>){
    val pedido = Pedido()

    if(pedido.status == StatusPedido.PROCESSANDO){
        println("pedido está sendo processado!")
    } else if(pedido.status == StatusPedido.APROVADO){
        println("pedido está sendo aprovado!")
    }
}