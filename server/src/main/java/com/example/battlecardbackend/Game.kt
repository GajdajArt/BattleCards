package com.example.battlecardbackend

class Game (private val socketService: SocketService){

    fun start() {
        socketService.start()
    }
}