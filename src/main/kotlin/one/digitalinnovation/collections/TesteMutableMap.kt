package one.digitalinnovation.collections

fun main() {
    val maria = Funcionario("Maria", 2000.00, "CLT")
    val jose = Funcionario("José", 1500.00, "PJ")
    val joao = Funcionario("João", 4000.00, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(jose.nome, jose)
    repositorio.create(maria.nome, maria)

    println("Busca por id: João")
    println(repositorio.findById(joao.nome))

    println("Retorna todos os funcionários do Map")
    repositorio.findAll().forEach { println(it) }
}