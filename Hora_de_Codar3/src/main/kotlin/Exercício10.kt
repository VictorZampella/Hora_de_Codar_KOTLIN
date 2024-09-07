fun main(){


    /*10 - Escreva um programa para imprimir todas as tabuadas de 1 a N. N será informado pelo usuário.*/

    println("Digite um numero a ser utilizado na tabuada: ")
    var x = readln().toInt()
    var tabuada = 1

    for (i in 1 ..x  ){
        println("Tabuada do $i")
        println("")
        println("$tabuada x 1 = "+tabuada * 1)
        println("$tabuada x 2 = "+tabuada * 2)
        println("$tabuada x 3 = "+tabuada * 3)
        println("$tabuada x 4 = "+tabuada * 4)
        println("$tabuada x 5 = "+tabuada * 5)
        println("$tabuada x 6 = "+tabuada * 6)
        println("$tabuada x 7 = "+tabuada * 7)
        println("$tabuada x 8 = "+tabuada * 8)
        println("$tabuada x 9 = "+tabuada * 9)
        println("$tabuada x 10 = "+tabuada * 10)
        tabuada++

    }







}