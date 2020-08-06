package domain.impl

import domain.ShuffleDeckInteractor
import data.model.Card

class ShuffleDeckInteractorImpl: ShuffleDeckInteractor {

    override fun shuffleDeck(orderedDeck: List<Card>) = orderedDeck.shuffled()
}