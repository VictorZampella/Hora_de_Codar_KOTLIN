fun main(){

/*11 - Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores lidos estão entre os
números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.
 */
    var lista_valores1 = mutableListOf<Int>()
    var lista_valores2 = mutableListOf<Int>()

    var contagem = 1

    for (i in 1..10){

       println("Digite o $contagem º valor")
       var numero = readln().toInt()
        contagem++

        if (numero < 24 || numero > 42 ){
            lista_valores1.add(numero)
        }

        else{
            lista_valores2.add(numero)
        }


    }

    println("A contagem dos que estão entre os numero 24 e 42 são: "+lista_valores2.count())
    println("")
    println("Os valores são: ")
    println("")
    for (i in lista_valores2){
        println(i)
    }

    println("")
    println("A contagem dos valores que estão fora são: "+lista_valores1.count())
    println("")
    println("Os valores são: ")
    println("")
    for (i in lista_valores1){
        println(i)
    }




}