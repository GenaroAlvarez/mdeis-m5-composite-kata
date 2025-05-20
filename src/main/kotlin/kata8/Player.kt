package kata8

class Player(private val name: String, private val score: Int): TeamComponent {
    override fun getScore(): Int {
        return score
    }

    override fun showDetails() {
        println("Jugador: $name, Puntaje: $score")
    }
}