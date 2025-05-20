package kata8

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SportTeamSystemAppTest {

    @Test
    fun showDetails() {
        val sportTeamSystemApp = SportTeamSystemApp()
        sportTeamSystemApp.showDetails()
    }
}