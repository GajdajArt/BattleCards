package com.example.battlecardbackend

const val HOST = "79.110.133.158"

fun main(args: Array<String>) {
    val socketService = SocketService()
    val game = Game(socketService)

    game.start()
}

class Game(
    private val statusService: SocketService
) {

    fun start() {
        statusService.start()
    }
}
