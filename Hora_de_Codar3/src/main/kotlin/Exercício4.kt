fun main(){

    //4 - FaÃ§a um algoritmo que calcule e escreva a mÃ©dia aritmÃ©tica dos nÃºmeros inteiros entre 15 (inclusive) e 100 (inclusive)./

    val list= mutableListOf<Double>()

    for (contador in 15..100) {
        list.add(contador.toDouble())
        //Colocando os valores de 15 a 100 dentro da lista
    }

    println("A média aritmetica dos numeros inteiros entre 15 e 100 é = "+list.sum()/list.count())










}