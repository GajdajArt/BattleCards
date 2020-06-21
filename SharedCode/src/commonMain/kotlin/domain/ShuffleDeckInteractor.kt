package domain

import domain.model.Card

interface ShuffleDeckInteractor {

    fun shuffleDeck(orderedDeck: List<Card>): List<Card>
}