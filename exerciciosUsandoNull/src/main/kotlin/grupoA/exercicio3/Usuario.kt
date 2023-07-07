package exerciciosUsandoNull.src.main.kotlin.grupoA.exercicio3

import java.time.LocalDate

class Usuario {
    private var idadeUsuario: Int = 0
    private var anosQueFaltam: Int = 0
    fun receberDadosUsuario() {

        print("Digite seu nome: ")
        val nomeUsuario: String? = readlnOrNull()

        print("Digite o ano que você nasceu: ")
        val anoNasc: Int? = readlnOrNull()?.toIntOrNull()

        if (nomeUsuario != null && anoNasc != null) {
            idadeUsuario = calcularIdadeDoUsuario(anoNasc)

            if (idadeUsuario >= 18) {
                print("Idade da(o) $nomeUsuario : $idadeUsuario anos\n")
                print("$nomeUsuario é maior de idade")
            } else {
                anosQueFaltam = 18 - idadeUsuario
                print("Idade da(o) $nomeUsuario : $idadeUsuario anos\n")
                print("$nomeUsuario, faltam $anosQueFaltam anos para você ser maior de idade! ")
            }
        }
    }
}

private fun calcularIdadeDoUsuario(anoNasc: Int): Int {
    val anoAtual = LocalDate.now().year
    return anoAtual - anoNasc
}

