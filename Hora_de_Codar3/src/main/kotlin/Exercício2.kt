import kotlin.concurrent.thread

fun main() {

//2 - Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".


  for( contador in 30 downTo 0){
      println(contador)
      Thread.sleep(1000)
  }
    println("EXPLOSÃO")











}