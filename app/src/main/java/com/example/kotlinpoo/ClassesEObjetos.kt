package com.example.kotlinpoo

class Casa{
    //Propriedades da classe
    var cor: String = ""


    //Métodos da classe
    fun abrirJanela(qtdJanelas: Int){
       println("Abrir Janela total: $qtdJanelas")
    }

    fun abrirPorta(){
        println("Abrir Porta")
    }

    fun abrirCasa(){
        //this é usado para acessar metodos dentro da propria classe
        //this.abrirJanela()
        this.abrirPorta()
    }
}


fun main(){

    val casa = Casa()
    casa.cor = "Amarela"
    casa.abrirJanela(4)

    /*val casa2 = Casa()
    casa2.cor = "Verde"*/

    println(casa.cor)
    /*println(casa2.cor)*/
}