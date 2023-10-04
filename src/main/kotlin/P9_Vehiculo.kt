class P9_Vehiculo {
    var color=""
    var marca=""
    var modelo=""
    var placas=""
    var gasolina=0f
    var encendido=false

    fun encender(){
        encendido=true
    }

    fun apagar(){
        encendido=false
    }

    fun recargar(litros:Float){
        gasolina+=litros
    }
}

fun main(){
    val miVehiculo = P9_Vehiculo()
    miVehiculo.color="verde"
    miVehiculo.marca="Vs Marca"
    miVehiculo.modelo="Focus"
    miVehiculo.placas="REM-4123"

    println("El coche esta prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche esta prendido? ${miVehiculo.encendido}")

    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene: ${miVehiculo.gasolina}")
}