package grupoR.exercicio4

fun main() {
    println("Digite a quantidade de alunos: ")
    val aluno = Aluno(readln().toInt())

    aluno.inserirAlunos()
    aluno.exibirInfo()
}