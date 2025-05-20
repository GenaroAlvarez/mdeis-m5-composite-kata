package kata8

class Team(private val name: String) : TeamComponent {
    private val players = mutableListOf<TeamComponent>()

    fun add(teamComponent: TeamComponent) {
        players.add(teamComponent)
    }

    override fun getScore(): Int {
        return players.sumOf { it.getScore() }
    }

    override fun showDetails() {
        players.forEach(TeamComponent::showDetails)
        println("Equipo: $name, Puntaje total: ${getScore()}")
    }
}