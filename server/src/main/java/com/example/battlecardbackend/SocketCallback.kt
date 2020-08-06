package com.example.battlecardbackend

import data.model.Player

interface SocketCallback {

    fun onStatus()
    fun onNewPlayer(player: Player)
    fun onGetNewCards(numberOfActionCards: Int, numberOfSquadCards: Int)
}