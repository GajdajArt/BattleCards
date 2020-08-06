package data

import data.model.Card

interface PlayerSquadRepository {

    fun getActionCards(number: Int): List<Card>

    fun discardCards(cards: List<Card>)
}