package grupoR.exercicio4

class Aluno(){
    private var qtdAlunos: Int? = null
    private var nome: String = ""
    private var nota: Double? = null
    private var turmaDeAlunos = arrayListOf<Aluno>()
    lateinit var alunosComNota: List<Aluno>
    lateinit var alunoSemNota: List<Aluno>
    constructor(qtdAlunos: Int?) : this() {
        requireNotNull(qtdAlunos){"A quantidade de alunos não pode ser nula"}
        require(qtdAlunos>0){"A quantidade não pode ser menor que 0"}
        this.qtdAlunos = qtdAlunos
    }

    fun inserirAlunos(){
        for (i in 0 until qtdAlunos!!){
            println("------------ALUNO ${i+1}------------")
            val aluno = Aluno()
            verificaNomeAluno()
            aluno.nome = nome
            println("Digite a nota do ${aluno.nome}: ")
            aluno.nota= readln().toDoubleOrNull()
            turmaDeAlunos.add(aluno)
        }
    }
    private fun verificaNomeAluno(){
        do {
            print("Digite o nome do aluno: ")
            nome = readln()
            val verificacao = nome.isBlank()
            if (verificacao) {
                println("Nome inválido. Tente novamente.")
            }
        } while (verificacao)
    }

    private fun separaAluno(){
        alunosComNota = turmaDeAlunos.filter {aluno-> aluno.nota!=null}
        alunoSemNota = turmaDeAlunos.filter {aluno-> aluno.nota==null}
    }
    fun exibirInfo(){
        separaAluno()
        if (alunoSemNota.isNotEmpty()){
            println("-----------Alunos Sem Nota------------")
            for (aluno in alunoSemNota){
                println("Nome: ${aluno.nome}")
            }
        }else println("Nenhum aluno sem nota lançada.")

        println("-----------Alunos Com Nota------------")
        for (aluno in alunosComNota){
            println("Nome: ${aluno.nome}")
            println("Nota: ${aluno.nota}")
        }
    }
}