val lista_de_alunos = mutableListOf<String>()
fun main(){

    /*6 - Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final.
    Considere que a nota de aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?"
     solicitar um resposta. Se a resposta for "S",
    o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados.
     */

    println("")
    println("Escolha uma opção:")
    println(" Deseja para calcular media de um aluno ")
    println(" 1 - sim")
    println(" 2 - Não ")
    println("")
    println(" Escolha sua opção: ")

    var opcao = readln().toInt()

    when(opcao){

        1 -> media()
        2 -> final()

    }


}

fun media(){

    println("Digite o nome do aluno: ")
    var aluno = readln()

    println("Digite a primeira nota: ")
    var nota1 = readln().toDouble()

    println("Digite a segunda nota: ")
    var nota2 = readln().toDouble()

    var nota_media = (nota1 + nota2) / 2


    if (nota_media < 9.5 ){

        println("O aluno foi reprovado")
    }

    else if (nota_media >= 9.5){

        println("O aluno foi aprovado")
        println("")
        lista_de_alunos.add(aluno)
    }


    println("Escolha uma opção:")
    println("")
    println(" Deseja  calcular media de outro aluno ")
    println(" 1 - sim")
    println(" 2 - para não ")
    println("")
    println(" Escolha sua opção")

    var opcao = readln().toInt()

    when(opcao){

        1 -> media()
        2 -> finalizar()

}
}

fun finalizar(){

    println("A quantidade de alunos aprovados é: = " +lista_de_alunos.count())
    println("Os Alunos aprovadas são: ")
    println("")
    for(i in lista_de_alunos){
        Thread.sleep(1000)
        println(i)
    }
}


    fun final(){
        println("OK OBRIGADO")
    }





















