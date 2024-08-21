fun main(){

    print("Digite o valor da sua base maior ? ")
    val basemaior: Double = readln().toDouble()

    print("Digite o valor da sua base menor ? ")
    val basemenor: Double = readln().toDouble()

    print("Digite o valor da sua altura ? ")
    var altura: Double = readln().toDouble()


    println("resultado = " + ((basemaior + basemenor) * altura)/2)

}