package data

import data.model.Card

interface PlayerActionCardsRepository {

    fun getActionCards(number: Int): List<Card>

    fun discardCards(cards: List<Card>)
}