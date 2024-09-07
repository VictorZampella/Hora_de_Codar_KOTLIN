var lista_estudantes = mutableListOf<String>()
fun main(){
    /*1
Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida,
 Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados
  e a lista com cada um deles.
     */

 println("Deseja cadastrar um aluno ? ")
 println("")
 println("1 - Sim")
 println("2 - Não")

 var opcao = readln().toInt()

    when(opcao){

        1 -> cadastro()
        2 -> final()
    }


}
fun cadastro(){


println("Digite o nome de um aluno")
    var aluno = readln()
    lista_estudantes.add(aluno)

    println("Deseja um cadastrar outro aluno ? ")
    println("")
    println("1 - Sim")
    println("2 - Não")

    var opcao = readln().toInt()

    when(opcao){
        1 -> cadastro()
        2 -> finalizar()
    }
}

fun finalizar(){

    println("")
    println("A quantidade de alunos cadastrados é: "+ lista_estudantes.count())
    println("")
    println("Os alunos cadastrados são: ")
    println("")
    for(i in lista_estudantes){
        Thread.sleep(1000)
        println(i)
    }

}

fun final(){
    print("Tenha um Bom dia")
}