package presentation.gamescreen

import domain.model.Card
import presentation.BaseView

interface GameScreenContract {

    interface View: BaseView {

        fun showMySquadCards(squadCards: List<Card>)

        fun showMyActionCards(squadCards: List<Card>)

        fun showOpponentSquadCards(squadCards: List<Card>)

        fun highlightCard(card: Card)

        fun normalizeCard(card: Card)

        fun showHint(hint: String)

        fun enableNextButton(enable: Boolean)

        fun showOpponentMove(squadCard: Card, actionCard: Card)

        fun showResult(result: String)
    }

    interface Presenter {

        fun unPickSquadCard(cardId: String)

        fun unPickActionCard(cardId: String)

        fun pickSquadCard(cardId: String)

        fun pickActionCard(cardId: String)

        fun onNextClick()
    }
}