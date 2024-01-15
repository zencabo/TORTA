class P8_ClassPhone {
    //atributos
    var isOn=false
    lateinit var model:String

    //metodos
    fun turnOn(){
        isOn=true
    }

    fun turnOff(){
        isOn=false
    }
    fun getTurn(){
        val turnMode=if (isOn) "Encendio" else "Apagado"
        println("El telefono esta $turnMode")
    }

}

fun main (){
    val myPhone = P8_ClassPhone()
    myPhone.getTurn()
    myPhone.turnOn()
    myPhone.getTurn()
}
