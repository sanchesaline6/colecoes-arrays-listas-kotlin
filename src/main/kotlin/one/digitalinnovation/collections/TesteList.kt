package one.digitalinnovation.collections

fun main() {

    val maria = Funcionario("Maria", 2000.00, "CLT")
    val jose = Funcionario("José", 1500.00, "PJ")
    val joao = Funcionario("João", 4000.00, "CLT")

    val funcionarios = listOf(maria, joao, jose)

    funcionarios.forEach{println(it)}

    println("Verifica se a funcionária Maria, se encontra na lista e retorna a mesma")
    println(funcionarios.find{it.nome == "Maria"})

    println("Ordena a lista por salários na ordem crescente")
    println(funcionarios
        .sortedBy{it.salario}
        .forEach{println(it)})

    println("Agrupa a lista por tipos de contratação")
    funcionarios
        .groupBy{ it.tipoContratacao }
        .forEach{ println(it) }
}

data class Funcionario(val nome: String, val salario: Double, val tipoContratacao: String){
    override fun toString(): String =
        """
         Nome: $nome
         Salário: $salario
         Tipo Contratação: $tipoContratacao
         
        """.trimIndent()
}