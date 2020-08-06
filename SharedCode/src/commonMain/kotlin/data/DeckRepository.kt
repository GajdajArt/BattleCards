package data

import data.model.Card

interface DeckRepository {

    fun createNewDeck(): List<Card>

    fun getShuffledDeck(): List<Card>

    fun setShuffledDeck(deck: List<Card>)
}