package com.example.battlecardbackend

fun main(args: Array<String>) {
    val socketService = SocketService()
    val game = Game(socketService)

    game.start()
}

class Server{}
