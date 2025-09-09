fun main (){
    val ( valorN, valorNumeroincial, valorSuma) = calcularSuma()
    println("La suma de los " + valorN + " números consecutivos desde "
            + valorNumeroincial + " es: " + valorSuma )

}

fun calcularSuma(): Triple<Int, Int, Int> {
    val numeroInicial = 5
    var suma = 0
    val n = 10

    for(i in 1..n){
        suma += ((numeroInicial-1) + i)

    }

    return Triple(n, numeroInicial, suma)
}