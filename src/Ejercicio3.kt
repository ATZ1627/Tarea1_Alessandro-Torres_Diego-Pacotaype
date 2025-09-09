import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val n = 2
    val resultado = calcularSuma(4)

    print("La suma de los $n terminos de la sucesion es: $resultado")
}

fun calcularSuma(n: Int):Double{
    var suma = 0.0

    for(i in 1..n){
        suma += calcularTermino(i)
    }
    return suma
}

fun calcularTermino(n: Int): Double{
    return -1.0 * ((-1.0).pow(n)/ sqrt((2.0*n)-1.0))
}