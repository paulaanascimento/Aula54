package grupoR.exercicio4

import java.lang.IllegalArgumentException
fun main() {
    while (true){
        try {
            println("Digite a quantidade de alunos: ")
            val aluno = Aluno(readln().toIntOrNull())
            aluno.inserirAlunos()
            aluno.exibirInfo()
            break
        }catch (erro:IllegalArgumentException){
            println( erro.message)
        }
    }


}