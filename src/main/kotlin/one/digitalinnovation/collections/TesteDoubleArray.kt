package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }


    println("Salários com aumentos")
    salarios.forEachIndexed{
            index, salario -> salarios[index] = salario * 1.1
    }
    salarios.forEach{ println(it)}
}