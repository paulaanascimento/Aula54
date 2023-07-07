package grupoA.exercicio2

class CompanhiaAerea(val nome: String, val codigo: String) {

    companion object {
        val companhias = arrayOf(
            CompanhiaAerea("LATAM Airlines Brasil", "LA"),
            CompanhiaAerea("Gol Linhas Aéreas", "G3"),
            CompanhiaAerea("Azul Linhas Aéreas", "AD"),
            CompanhiaAerea("Avianca Brasil", "AV"),
            CompanhiaAerea("Air France", "AF"),
            CompanhiaAerea("American Airlines", "AA")
        )
        fun obterCompanhia(codigo: String): CompanhiaAerea? {

            for (companhia in companhias) {
                if (companhia.codigo == codigo) {
                    return companhia
                }
            }
            return null
        }
        fun listarCompanhiasAereas() {
            println("Lista de Companhias Aéreas:")
            for (companhia in companhias) {
                println("Nome: ${companhia.nome} | Código: ${companhia.codigo}")
            }
        }

    }
}