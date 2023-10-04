val nombres = listOf("Pedro", "Juan", "Maria", "Romero", "Ernesto", "Juan", "Ariadna", "Mireya", "Ana", "Jose")
val nombreBuscar= "Juan"

fun main(){
    fun contarRepeticiones(nombre:String, listaNombres: List<String>): Int{
        var contador=0
        for (nombreActual in listaNombres){
            if (nombreActual==nombre){
                contador++
            }
        }
        return contador
    }
    val repeticiones=contarRepeticiones(nombreBuscar,nombres)
    println("El nombre '$nombreBuscar' se repite $repeticiones veces en la lista.")
}

