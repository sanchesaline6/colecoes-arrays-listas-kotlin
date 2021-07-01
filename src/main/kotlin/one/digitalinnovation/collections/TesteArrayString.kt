package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Aline"
    nomes[1] = "João Gabriel"
    nomes[2] = "Ana Maria"

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val names2 = arrayOf("Maria", "José", "João")
}