fun main() {

    /*1 - Escreva um algoritmo para ler 2 valores informados pelo usuário e se o segundo valor informado for igual ou menor que ZERO,
     deve ser lido um novo valor. Ou seja, para o segundo valor não pode ser aceito o valor zero, nem um valor negativo.

    O seu programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor e exibir o resultado ao usuário.*/


    println("Digite o primeiro valor: ")
    var valor1=readln().toDouble()

    println("Digite o primeiro valor: ")
    var valor2=readln().toDouble()


    while (valor2 <= 0.0){
        println("Digite o segundo valor novamente")
        valor2= readln().toDouble()
    }

    var conta:Double = (valor1 / valor2)

    println("O resultado da divisão é igual a $conta ")
















}
