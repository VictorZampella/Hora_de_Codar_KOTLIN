import kotlin.concurrent.thread

fun main(){

    /*8 - Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.
    N  é um valor informado pelo usuário*/

    println("Digite um valor a ser percorrido: ")
    var x = readln().toInt()
    println("Os valores inteiros de 1 até valor x é igual a: ")
    for (contador in 1..x) {
    Thread.sleep(1000)
        //Colocando os valores de 1 a x dentro da lista

        println(contador)

    }



}