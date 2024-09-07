fun main(){

    /*Crie uma array de planetas que inclua "Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno"  e, em seguida, peça ao usuário para digitar o nome de um planeta.

    Verifique se o planeta que o usuário informou está na array e informe ao usuário.*/

    val lista_planetas = listOf<String>("Terra","Marte","Plutão","Vênus", "Júpiter", "Saturno")

    println("Digite o nome de um planeta")

    var planeta = readln().toString()


    if(lista_planetas.contains(planeta)){

        println("O planeta contem em nosso sistema solar")
    }

    else{

        println("O planeta descrito não existe em nosso sistema solar")
    }






}