package com.example.kotlinpoo


fun main(){
    val casa2 = Casa2("Amarela", 3)
    casa2.detalhesCasa()

}
    //construtor primario () vai dentro da classe.
class Casa2(var cor:String, var vagasGaragem:Int ){

    //Propriedades da classe
    /*var cor: String = ""
    var vagasGaragem: Int = 0*/


        //CONSTRUTOR SECUNDARIO
        /*constructor(cor:String, vagasGaragem:Int){
            this.cor = cor
            this.vagasGaragem = vagasGaragem
        }*/


    //Métodos da classe
    fun detalhesCasa(){
        println("A casa tem a cor: $cor, Vagas: $vagasGaragem")
    }

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