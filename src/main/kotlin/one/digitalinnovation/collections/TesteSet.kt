package one.digitalinnovation.collections

fun main() {

    val maria = Funcionario("Maria", 2000.00, "CLT")
    val jose = Funcionario("José", 1500.00, "PJ")
    val joao = Funcionario("João", 4000.00, "CLT")

    val funcionarios1 = setOf(joao, jose)
    val funcionarios2 = setOf(maria)

    println("Resultado União")
    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }
    println("Resultado Diferença")
    val resultSubtracao = resultUnion.subtract(funcionarios2)
    println(resultSubtracao)
    println("Resultado Intersecção")
    val resultInterseccao = resultUnion.intersect(funcionarios2)
    println(resultInterseccao)
}

