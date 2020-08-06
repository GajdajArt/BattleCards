package com.example.battlecardbackend

import com.google.gson.Gson
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.http.cio.websocket.pingPeriod
import io.ktor.http.cio.websocket.timeout
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import io.ktor.websocket.WebSockets
import io.ktor.websocket.webSocket
import java.time.Duration

class SocketService {

    fun start() {
        val server = embeddedServer(Netty, 8080, host = HOST) {

            install(CallLogging)

            install(WebSockets) {
                pingPeriod = Duration.ofSeconds(15)
                timeout = Duration.ofSeconds(15)
                maxFrameSize = Long.MAX_VALUE
                masking = false
            }

            install(ContentNegotiation) {
                gson {
                }
            }

            val gson = Gson()

            routing {
                webSocket(path = STATUS_PATH) {

                }
            }
        }
        server.start(wait = true)
    }

    companion object {
        private const val STATUS_PATH = "/status"
    }
}