fun main(){


    /*
     *  5 - Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
      */


        var list = mutableListOf<Int>()


        println("Digite o primeiro numero:")
        val x = readln().toInt()

        println("Digite o segundo numero:")
        val y= readln().toInt()



        for (i in x..y){
            println(i)
            list.add(i)
        }

        println("A média aritimetica entre todos os valores que estão entre x e y é: "+list.sum()/list.count())
    }


