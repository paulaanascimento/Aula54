package grupoR.exercicio2

import grupoR.exercicio2.CompanhiaAerea.Companion.listarCompanhiasAereas
import grupoR.exercicio2.CompanhiaAerea.Companion.obterCompanhia

fun main() {
    println("Seja Bem-Vinda(o)!")
    listarCompanhiasAereas()
    println("\nDigite um código para a companhia da sua escolha: ")
    var codigo = readln()
    codigo = codigo.ifBlank { "0" }
    val companhia = obterCompanhia(codigo)
    if (companhia == null) {
        println("Companhia não encontrada para o código $codigo")
    } else {
        println("A companhia aéra para o código $codigo é ${companhia.nome}.")
    }
}