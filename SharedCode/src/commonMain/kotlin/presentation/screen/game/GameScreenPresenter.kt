package presentation.screen.game

import data.model.Card
import data.model.GamePhase
import presentation.BasePresenter

class GameScreenPresenter: BasePresenter<GameScreenContract.View>(),
    GameScreenContract.Presenter {

    private var currentPhase: GamePhase = GamePhase.HAND_OVER

    private var mySquadCards = mutableListOf<Card>()
    private var myActionCards = mutableListOf<Card>()
    private var myPickedSquadCards = mutableListOf<Card>()
    private var myPickedActionCards = mutableListOf<Card>()

    private var opponentsSquadCards = mutableListOf<Card>()
    private var opponentsActionCards = mutableListOf<Card>()
    private var opponentsPickedSquadCards = mutableListOf<Card>()
    private var opponentsPickedActionCards = mutableListOf<Card>()

    override fun unPickActionCard(cardId: String) {
        TODO("Not yet implemented")
    }

    override fun pickActionCard(cardId: String) {
        TODO("Not yet implemented")
    }

    override fun pickSquadCard(cardId: String) {
        TODO("Not yet implemented")
    }

    override fun unPickSquadCard(cardId: String) {
        TODO("Not yet implemented")
    }

    override fun onNextClick() {
        TODO("Not yet implemented")
    }

    private fun startHandOverPhase() {

    }

    private fun startFirstDraftPhase() {

    }

    private fun startSecondDraftPhase() {

    }

    private fun startPrepareBattlePhase() {

    }

    private fun startFightPhase() {

    }

    private fun startResultPhase() {

    }

}