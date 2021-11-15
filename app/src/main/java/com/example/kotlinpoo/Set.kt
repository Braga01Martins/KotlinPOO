package com.example.kotlinpoo
/*
Set -> não permite elementos duplicados, é mais rapido que o ArrayList
não mantem a ordem dos elementos.

Map -> é uma implementação chave/valor
 */


fun main(args: Array<String>){

    var map = hashMapOf(
        "Urso " to " Animal que hiberna",
        "cao " to " Melhor amigo do homem",
        "gato " to " Animal solitário"

    )
    map.put("passaro ", " Gosta de voar")
    map.remove("passaro")

    for(item in map.keys){ // map.values ou map.keys
        println(item)
    }





    /*var itens = hashSetOf("a","b","c","c")

    for(item in itens){
        println(item)
    }

    println(itens)*/


}