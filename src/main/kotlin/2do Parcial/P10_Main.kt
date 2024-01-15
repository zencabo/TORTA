import kotlin.concurrent.schedule

fun main() {
    val mario = Mario()

    mario.collision("pipe")
    mario.collision("goomba")

    for (i in 1..5) {
        mario.collision("Goomba")
        println("Te quedan ${mario.getLives()}")
    }

    /*
    if (mario.isAlive) {
        mario.collision("Goomba") // Corregí el typo en "Gooma" a "Goomba"
        println("Te quedan ${mario.getLives()}")
    }*/

}

class P10_Mario(var vidas: Int = 3) {
    init {
        println("It's me Mario") // se presenta al construirlo
    }

    private var state = "small"
        set(value) {
            field = when (value) {
                "Super mario", "fire mario", "star" -> value
                else -> "small"
            }
        }

    private var lives = 3
        set(value) {
            if (field == 1) {
                field = 0
                gameOver()
            } else if (field == 0) {
                println("Necesitas volver a jugar")
            } else {
                field = value
            }
        }

    val isAlive: Boolean
        get() = lives > 0

    private fun die() { // setter
        lives--
        println("Has perdido una vida ")
    }

    fun collision(collisionObj: String) {
        when (collisionObj) {
            "Goomba" -> die()
            "super mushroom" -> state = "Super mario"
            "Fire flower" -> state = "fire mario"
            "star" -> state = "star"
            else -> println("Objeto desconocido ¡no pasa nada!")
        }
    }

    fun getLives(): String {
        return "$lives vidas"
    }

    private fun gameOver() {
        println("Juego TERMINADO")
    }
}
