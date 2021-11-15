package com.example.kotlinpoo

/*
Pode-se dizer, a grosso modo, que uma interface é um contrato que quando assumido por uma classe
deve ser implementado.

Interface é utilizada pois podemos ter muitos objetos(Classes) que podem possuir á mesma
 ação(Métodos) porém, podem executá-las de maneira diferente.
 */

fun main(){
    val jamilton = Jamilton()
    jamilton.diretitosDeveres()

    val obama = Obama()
    obama.ganharEleicao()
    obama.temFilho()

}

interface Presidente{
    fun ganharEleicao()
}

interface Pai{
    fun temFilho()
}

open class Cidadao{
    fun diretitosDeveres(){
        println("Todo cidadao tem diretos e deveres")
    }
}

class Jamilton: Cidadao(){

}

class Obama : Cidadao(), Presidente, Pai{
    override fun ganharEleicao() {
        println("Ganhar Eleicao nos EUA")
    }

    override fun temFilho() {
        println("Tem filhos")
    }

}