package com.example.battlecardbackend

import com.google.gson.Gson
import data.impl.ServerSocketClient.Companion.HOST
import data.impl.ServerSocketClient.Companion.PORT
import data.impl.ServerSocketClient.Companion.TEST_PATH
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.http.cio.websocket.Frame
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
        val server = embeddedServer(Netty, PORT, host = HOST) {

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

                webSocket(path = TEST_PATH) {
                    send(Frame.Text("This is the webSocket"))
                }
            }
        }
        server.start(wait = true)
    }

    companion object {
        private const val STATUS_PATH = "/status"
    }
}