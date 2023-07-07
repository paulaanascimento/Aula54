package grupoR.exercicio03

fun main() {
    print("Digite a quantidade de itens que deseja adicionar à lista: ")
    var quantidade = readln().toIntOrNull()?:0

    if(quantidade < 0){
        quantidade = 0
    }

    val listaCompras = adicionarProdutosLista(quantidade)
    mostrarProdutosLista(listaCompras)
}

fun adicionarProdutosLista(quantidade:Int):ArrayList<String?>{
    val listaCompras = ArrayList<String?>()

    for(i in 0 until quantidade){
        print("Digite o ${i+1} produto: ")
        val produto = readln()

        if(produto.isBlank()){
            listaCompras.add(null)
        } else listaCompras.add(produto)
    }

    return listaCompras
}

fun mostrarProdutosLista(listaCompras:ArrayList<String?>){
    if(listaCompras.isEmpty()){
        println("\nNenhum produto foi adicionado à lista!")
    } else{
        println("\n----------LISTA DE COMPRAS----------")
        listaCompras.forEach { produto -> println(produto) }
    }
}