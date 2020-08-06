package data.impl

import data.DeckRepository
import data.model.ActionType
import data.model.Card
import data.model.CardType

object ActionDeckRepositoryImpl : DeckRepository {

    private var lastId = 0

    override fun createNewDeck(): List<Card> {
        return listOf(
            createAttackCard(),
            createAttackCard(),
            createAttackCard(),
            createDefenceCard(),
            createDefenceCard(),
            createDefenceCard(),
            createRetreatCard(),
            createRetreatCard(),
            createRetreatCard(),
            createRushAttackCard(),
            createRushAttackCard(),
            createRushAttackCard()
        )
    }

    override fun getShuffledDeck(): List<Card> {
        TODO("Not yet implemented")
    }

    override fun setShuffledDeck(deck: List<Card>) {
        TODO("Not yet implemented")
    }

    private fun createAttackCard() =
        Card(
            id = generateId(),
            cardType = CardType.ACTION,
            actionType = ActionType.ATTACK
        )

    private fun createDefenceCard() =
        Card(
            id = generateId(),
            cardType = CardType.ACTION,
            actionType = ActionType.DEFENCE
        )

    private fun createRushAttackCard() =
        Card(
            id = generateId(),
            cardType = CardType.ACTION,
            actionType = ActionType.RUSH_ATTACK
        )

    private fun createRetreatCard() =
        Card(
            id = generateId(),
            cardType = CardType.ACTION,
            actionType = ActionType.RETREAT
        )

    private fun generateId() = "${CardType.ACTION.ordinal}_${lastId++}"
}