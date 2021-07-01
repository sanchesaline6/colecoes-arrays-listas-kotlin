package one.digitalinnovation.collections

fun main() {
    val pair : Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach{ k, v -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf("Aline" to 1600.00, "João" to 1000.00)
    map2.forEach{ println(it)}
}
