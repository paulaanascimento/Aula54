package grupoA.`Exercicio 2`

fun main() {
Produtos().produtos()
}
class Produtos(){
    data class Produto(val nomeProduto: String?)
    fun produtos() {
        val listaProduto = listOf<Produto?>(
            Produto("Uva"),
            Produto(null),
            Produto("Morango"),
            Produto(null),
            Produto("Manga")
        )
        for (produto in listaProduto){
            if (produto?.nomeProduto != null){
            println(produto.nomeProduto)
        }
    }
}
}
