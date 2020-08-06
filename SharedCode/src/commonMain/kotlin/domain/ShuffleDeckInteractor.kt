package domain

import data.model.Card

interface ShuffleDeckInteractor {

    fun shuffleDeck(orderedDeck: List<Card>): List<Card>
}