package com.example.kotlinpoo

/*
Collections ou colecoes -> são implementacoes de estruturas de dados
- List -> Imutável, tamanho fixo, apenas para leitura.
- ArrayList -> Mutável, sem tamanho fixo, pode adicionar ou remover
 */


fun main(args: Array<String>){

   /*var listaItens = listOf("SP","RJ","MG")
    println(listaItens)*/

    var listasItens = arrayListOf("SP","RJ","MG")
    listasItens.add("BA")
    //listasItens.remove("SP")
    //listasItens.removeAt(0)
    println(listasItens.size)
    println(listasItens.isEmpty())
}