package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1020.0, 2250.0, 4080.0, 2600.00, 3500.00)

    val maiorSalario = salarios.maxOrNull()
    val menorSalario = salarios.minOrNull()
    val mediaSalario = salarios.average()

    println("Maior salário: $maiorSalario")
    println("Menor salário: $menorSalario")
    println("Salário médio: $mediaSalario")

    val salarioMaiorQue2500 = salarios.filter {
        it > 2500.00
    }
    println("Salário(s) maior(es) que 2500.00: $salarioMaiorQue2500")

    println("Imprime a quantidade de salários o intervalo de 2000.0 a 5000.0")
    val salarios2000a5000 = salarios.count { it in 2000.0..5000.0 }
    println("Salários entre 2000 a 5000: $salarios2000a5000")

    println("Verifica se dentro dos salarios tem 2550.0")
    println(salarios.find { it == 2550.0 })

    println("Verifica se tem algum valor igual a 1.000")
    println(salarios.any{ it == 1020.0})
}