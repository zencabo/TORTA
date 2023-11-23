//Autor - Cristian Alain Bustamante Osorio
fun main() {
    // Asignar un número decimal por defecto
    val decimal: Double = 3.14
    println("\nVariable decimal: $decimal")

    // Convertir la variable decimal a flotante
    val flotante: Float = decimal.toFloat()
    println("Variable flotante: $Float")

    // Declarar una variable constante para PI
    val PI: Double = 3.14159265359
    println("Variable Pi: $PI")

    // Calcular el perímetro del círculo
    val perimetro = 2 * decimal * PI

    // Imprimir el resultado usando String Template
    println("\nAl multiplicar 2 * decimal * pi, nos da el perímetro del círculo siendo: $perimetro nuestro resultado.\n")
}
