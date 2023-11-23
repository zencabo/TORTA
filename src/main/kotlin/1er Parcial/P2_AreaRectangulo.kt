fun rectangleArea(base:Double = 10.0, height:Double=10.0, ancho:Double=10.0):Double{
    return base*height*ancho
}
fun main() {
    println("Area con valores por defecto: ${rectangleArea()}")

    //Area con altura posterior y asignado
    println("Area con los tres valores del prisma: ${rectangleArea(height=11.0, base=3.5, ancho=8.1)}")

}
