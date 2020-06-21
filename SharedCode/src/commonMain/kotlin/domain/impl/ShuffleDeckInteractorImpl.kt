package domain.impl

import domain.ShuffleDeckInteractor
import domain.model.Card

class ShuffleDeckInteractorImpl: ShuffleDeckInteractor {

    override fun shuffleDeck(orderedDeck: List<Card>) = orderedDeck.shuffled()
}