package one.digitalinnovation.collections

import java.math.BigDecimal

//Permitir criar funções para uma classe específica de um tipo específico, sem precisar herdar
//a mesma.

fun Array<BigDecimal>.somatoria() = this.reduce{
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty())
        BigDecimal.ZERO
    else
        this.somatoria() / this.size.toBigDecimal()

fun main() {
    val valores = arrayOf("4".toBigDecimal(), "5".toBigDecimal(), "6".toBigDecimal())
    println("Mostra a somatória")
    println(valores.somatoria())
    println("Mostra a média")
    println(valores.media())
}