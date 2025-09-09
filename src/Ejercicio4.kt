fun main(){
    print("Los trenes se tardaran en encontrarse ${calcularTiempo()} horas")
}

fun calcularTiempo(): Double{
    val velocidadA = 80.0
    val velocidadB = 70.0
    val distancia = 400.0

    val resultado = distancia/(velocidadA + velocidadB)

    return resultado
}