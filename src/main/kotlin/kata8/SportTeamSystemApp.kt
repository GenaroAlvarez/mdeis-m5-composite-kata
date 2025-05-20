package kata8

class SportTeamSystemApp {
    fun showDetails() {
        val player1: TeamComponent = Player("Carlos", 10)
        val player2: TeamComponent = Player("Ana", 15)
        val team = Team("Equipo A")

        team.add(player1)
        team.add(player2)

        team.showDetails()
    }
}