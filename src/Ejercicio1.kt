import kotlin.random.Random

fun main() {
    val (mejorAlumno, mejorPromedio, cantidadSuspendidos) = calcularNota()
    println("El mejor promedio es $mejorPromedio y pertenece a $mejorAlumno")
    println("La cantidad de suspendidos es $cantidadSuspendidos ")
}
fun calcularNota(): Triple<String, Double, Int> {
    val numeroAlumnos = 20
    val numeroAsignaturas = 3
    var mejorPromedio = 0.0
    var mejorAlumno = ""
    var cantidadSuspendidos = 0

    for ( i in 1..numeroAlumnos){
        var nombre = "Alumno " + i
        var sumaNotas = 0
        for ( j in 1..numeroAsignaturas){
            var nota =  Random.nextInt(0, 21)
            sumaNotas = sumaNotas + nota
        }
        var promedio = sumaNotas.toDouble() / numeroAsignaturas
        if ( promedio > mejorPromedio ){
            mejorPromedio = promedio
            mejorAlumno = nombre
        }

        if (promedio < 12) {
            cantidadSuspendidos++
        }

    }
    return Triple(mejorAlumno, mejorPromedio, cantidadSuspendidos)

}
