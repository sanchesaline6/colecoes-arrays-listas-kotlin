package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    //usando um laço for
    for(value in values){
        println(value)
    }

    println("------------------------")
    //usando forEach (expressão lambda)
    values.forEach{
        println(it)
    }

    println("------------------------")
    for(indice in values.indices){
        println(values[indice])

    }}