fun main() {

    val base = 3.0f
    val altura = 4.0f
    val ancho = 3.0f
    val volumen = volumenPrisma(base,altura,ancho)
    println("el volumen del prisma es $volumen")
}

fun volumenPrisma(base: Float, altura: Float, ancho: Float):Float{
    return base * altura * ancho
}