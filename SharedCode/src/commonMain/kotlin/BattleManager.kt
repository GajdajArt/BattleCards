import data.model.Card
import data.model.GameState

interface BattleManager {

    fun placeSquads(squads: List<Card>)

    fun move(squad: Card, action: Card)

    fun getOpponentMove(): List<Card>

    interface StateChangeListener {

        fun onNewState(newState: GameState)
    }
}