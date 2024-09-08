var lista_de_compras= mutableListOf<String>("banana","maça","pera","uva",)
fun main(){

    /*3
Vamos criar uma lista de compras.

Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.

Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista".

Peça novamente para o usuário digitar o nome de uma fruta para ser removida.

Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".

Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".
*/

    println("Bem-vindo ao nosso mercado")
    println("")
    println("Deseja ver nossa lista de frutas ? ")
    println("1 - Sim")
    println("2 - Não")

    var opcao = readln().toInt()


    when(opcao){

        1 -> retirar()
        2 -> finalizar_lista()
    }

}

fun retirar() {
    println("A lista de compras é: ")
    println("")
    for (i in lista_de_compras) {
            Thread.sleep(500)
            println(i)
    }


    println("")
    println("Deseja riscar algo da sua lista de frutas ?")
    println("")
    println("1 - Sim")
    println("2 - Não")


    var opcao2 = readln().toInt()

   while (opcao2 == 1){
        println("")
        println("Qual item deseja retirar de sua lista")
        var fruta = readln()
        lista_de_compras.remove(fruta)



       if(lista_de_compras.isEmpty()){
           println("lISTA FINALIZADA")
           break
       }
    }

    while (opcao2 == 2){
        println("A sua Lista está finalizada")
    }


}
fun finalizar_lista(){
    println("OK OBRIGADO")
    println("")
    println("Sua lista permanece:")
    println("")
    for (i in lista_de_compras) {
        Thread.sleep(500)
        println(i)
    }
}