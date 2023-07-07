package grupoR.exercicio1

class Pessoa(var nome:String, var idade:Int?) {
    fun informacoes(){
        println("Nome: $nome - Idade: ${idade ?: "Desconhecida"}")
    }

    fun  maiorDeIdade(){
        if(idade==null){
            println("Como a idade é desconhecida, não é possível informar se a pessoa é maior de idade ou não.")
        } else{
            val ehMaior = idade!! >=18
            println("É maior de idade: $ehMaior")
        }
    }
}