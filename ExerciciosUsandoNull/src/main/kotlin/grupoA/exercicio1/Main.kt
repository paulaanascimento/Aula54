package grupoA.exercicio1

fun main() {
    println("Digite o numero de funcionários: ")
    val quantidadeFuncionario = readln().toIntOrNull()

    val gradeFuncionario = GradeFuncionario()
    if (quantidadeFuncionario != null && quantidadeFuncionario > 0){
        gradeFuncionario.preencherGrade(quantidadeFuncionario)
        gradeFuncionario.exibirFuncionario()

        println("== Média salarial ==")
        gradeFuncionario.calcularMediaSalario()
    }else{
        println("Quantidade inválida")
    }
}
class GradeFuncionario(){
    data class grade(var nome : String,var cargo : String,var salario : Double? = null)
    val listaFuncionario = mutableListOf<grade>()

    fun preencherGrade (quantidadeFuncionario : Int) {

        for (i in 1..quantidadeFuncionario) {
            println("Digite o nome do funcionario $i:")
            val name = readln()
            println("Digite o cargo do funcionário $i:")
            val cargo = readln()

            while (true){
                println("Digite o salario do funcionario $i")
                val salario = readln().toDoubleOrNull()?:0.0
                if (salario > 0) {
                    val funcionario = grade(name, cargo, salario)
                    listaFuncionario.add(funcionario)
                    break
                } else {
                    println("Salário inválido o valor deve ser maior que 0")
                }
            }
        }
    }
    fun calcularMediaSalario(){
        var totalSalario = 0.0

        for (funcionario in listaFuncionario) {
            totalSalario += funcionario.salario!!
        }
        if (listaFuncionario.isNotEmpty()){
            val mediaSalarial= totalSalario/ listaFuncionario.size
            println("A média salarial é $mediaSalarial")

        } else {
            println("lista vazia")
        }
    }
    fun exibirFuncionario(){
        println("Funcionários existentes")
        listaFuncionario.forEach{
            println("Nome: ${it.nome} /Cargo: ${it.cargo} /Salario:${it.salario}")
        }

    }
}