package one.digitalinnovation.collections

fun main() {
    val maria = Funcionario("Maria", 2000.00, "CLT")
    val jose = Funcionario("José", 1500.00, "PJ")
    val joao = Funcionario("João", 4000.00, "CLT")

    println("Mostra todos os funcionários da lista")
    val funcionarios = mutableListOf(maria, jose, joao)
    funcionarios.forEach{println(it)}

    println("Adiciona o funcionário Pedro")
    funcionarios.add(Funcionario("Pedro", 3500.00, "PJ"))
    funcionarios.forEach { println(it) }

    println("Remove o funcionário João")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("Mostra o set de funcionarios")
    val funcionariosSet = setOf(maria, jose, joao)
    funcionariosSet.forEach { println(it) }
}