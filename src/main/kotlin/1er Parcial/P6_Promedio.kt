import kotlin.math.ceil
import kotlin.math.floor

fun main() {
    val promedio = promedio(n3 = 10.0)
    println("Tu promedio es: $promedio")

    val roundedNumber = if (promedio > 6) {
        if (promedio - promedio.toInt() >= 0.5) {
            ceil(promedio)
        } else {
            floor(promedio)
        }
    } else {
        promedio
    }

    println("Número redondeado: $roundedNumber")
}

fun promedio(n1: Double = 8.0, n2: Double = 8.0, n3: Double): Double {
    return (n1 + n2 + n3) / 3
}
