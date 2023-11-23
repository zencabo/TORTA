class P10_Goomba(name: String, strength: Int) : Enemy(name, strength) { // Clase hijo de Enemy

    init {
        println("Iniciando subclase de $name")
    }
}
