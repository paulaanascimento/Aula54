package grupoA.exercicio4

fun main() {
    var votosMatrix = 0
    var votosSenhorDosAneis = 0

    for (i in 1..2) {
        println("Opções de sagas concorrentes:\n" +
                "1. Matrix\n" +
                "2. Senhor dos Anéis")
        println("Digite o número correspondente à melhor saga de filme (1 ou 2):")

        val votoSaga = readlnOrNull()?.toIntOrNull()

        when (votoSaga) {
            1 -> votosMatrix++
            2 -> votosSenhorDosAneis++
            else -> {
                println("Opção invalida, insira novamente a opção correta")
            }
        }
    }

    println("Total de votos para a saga Matrix: $votosMatrix")
    println("Total de votos para a saga Senhor dos Anéis: $votosSenhorDosAneis")

    if (votosMatrix > votosSenhorDosAneis) {
        println("A saga vencedora é Matrix =)")
    } else if (votosMatrix < votosSenhorDosAneis) {
        println("A saga vencedora é Senhor dos Anéis =)")
    } else {
        println("Houve um empate entre as sagas")
    }
}