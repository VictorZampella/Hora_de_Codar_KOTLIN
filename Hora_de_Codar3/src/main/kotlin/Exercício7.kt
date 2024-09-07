fun main(){

    /*7 - Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno.
    Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
    Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor ao usuário. */


   var  lista_de_notas = mutableListOf<Double>()

    for (i in 1..6){

        println("Digite uma nota: ")
        var nota = readln().toDouble()

        if (nota > 10 || nota < 0){
            println("NOTA INVALIDA")
            println("Digite uma nota válida: ")
            nota = readln().toDouble()
        }

        else{
            lista_de_notas.add(nota)
        }

    }

    var media = lista_de_notas.sum() / lista_de_notas.count()

    println("A média das seis notas: "+media)









}