import java.security.Principal
import kotlin.system.exitProcess
var nome = ""
var saldo = 100.5 // Float


fun main() {
    println("Olá Bom dia")
    println("")
    println("Por gentileza, qual o seu nome ?")
    nome = readln()
    println("")
    inicio()
}

fun inicio() {
    println("")
    println("$nome escolha uma opção ")
    println("")
    println(" 1 - Ver saldo")
    println(" 2 - ver extrato")
    println(" 3 - fazer saque")
    println(" 4 - fazer deposito")
    println(" 5 - fazer transferência")
    println(" 6 - sair")
    println("")
    val escolha = readLine()?.toIntOrNull()

    when (escolha) {
        1 -> verSaldo()
        2 -> verExtrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia()
        6 -> sair()

        else -> erro()
    }
}

fun verSaldo() {
    println("Informe uma senha para ver o saldo: ")
    var senha = readln().toInt()
    println("")


    if (senha == 3589){
        println("$nome seu saldo atual é: $saldo")
    }

    else {
        println("Senha Incorreta")
        verSaldo()
    }

    inicio()

}

fun fazerDeposito() {
    print("Qual o valor para depósito? ")
    var deposito = readLine()?.toDoubleOrNull()

    if (deposito == null) {
        println("")
        println("Por favor, informe um número válido.")
        println("")
        fazerDeposito()
    }
    else if(deposito <= 0.0){
        println("Operação não autorizada")
        println("Informe um numero válido")
        fazerDeposito()
    }

    else {
        saldo += deposito
        verSaldo()
    }
}

fun fazerSaque() {
    println("Informe uma senha para fazer o saque: ")
    var senha = readln().toInt()
    println("")

    if(senha == 3589) {
        println("")
        print("Qual o valor para saque? ")
        println("")
        val saque = readLine()?.toFloatOrNull()

        if (saque == null) {
            println("")
            println("Por favor, informe um número válido.")
            fazerSaque()
        } else if (saque > saldo) {
            println("")
            println("Operação não autorizada")
        }

        else {
            saldo -= saque
            verSaldo()
        }
    }
    else{
        println("Senha Incorreta")
        fazerSaque()
    }
}

fun verExtrato(){
    println("Informe uma senha para ver o extrato: ")
    var senha = readln().toInt()
    println("")

if (senha == 3589) {
    println("=================================")
    println("          Extrato Bancário       ")
    println("=================================")
    println("Data       | Descrição          | Valor")
    println("---------------------------------")
    println("01/09/2024 | Supermercado XYZ    | R$ 150,00")
    println("02/09/2024 | Posto de Gasolina   | R$ 200,00")
    println("03/09/2024 | Loja de Eletrônicos | R$ 1.200,00")
    println("04/09/2024 | Restaurante ABC     | R$ 85,00")
    println("05/09/2024 | Cinema              | R$ 50,00")
    println("---------------------------------")
    println("Saldo Final:        | R$ 2.315,00")
    println("=================================")
}
else{
    println("Senha Incorreta")
    verExtrato()
}


}

fun fazerTransferencia() {

    println("Informe uma senha para fazer uma transferência : ")
    var senha = readln().toInt()
    println("")
    if (senha == 3589) {
        println("")
        print("Qual o valor para fazer transferência ? ")
        println("")
        var tranferencia = readLine()?.toFloatOrNull()

        if (tranferencia == null) {
            println("")
            println("Por favor, informe um número válido.")
            tranferencia = readln().toFloatOrNull()
        } else if (tranferencia > saldo) {
            println("Operação não autorizada")
        } else {
            saldo -= tranferencia
            verSaldo()
        }
    }
    else{
        println("Senha Incorreta")
        fazerTransferencia()
    }
}


fun erro() {
    println("Por favor, informe um número entre 1 e 6.")
    inicio()
}


fun sair() {
    println("Você deseja sair? (S/N) ")
    println("")
    val confirma = readLine()?.toUpperCase()

    when (confirma) {
        "S" -> sair2()
        "N" -> inicio()
        else -> sair()
    }


}
fun sair2(){
    println("$nome,foi um prazer ter você por aqui!")
    exitProcess(0)
}
