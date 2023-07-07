package grupoR.exercicio1

fun main() {

    var nome:String
    do{
        print("Digite o seu nome: ")
        nome = readln()
    } while (nome.isBlank())


    print("Digite a sua idade: ")
    val idade = readln().toIntOrNull()


    val usuario = Pessoa(nome, idade)
    usuario.informacoes()
    usuario.maiorDeIdade()
}