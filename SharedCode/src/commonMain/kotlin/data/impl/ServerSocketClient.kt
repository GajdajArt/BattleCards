package data.impl

class ServerSocketClient {
//
//    private val job = Job()
//
//    private val client = HttpClient {
//        install(WebSockets)
//        install(JsonFeature) {
//            serializer = KotlinxSerializer()
//        }
//    }
//
//    override val coroutineContext = job + Dispatchers.Default
//
//    fun sendTest() {
//        launch {
//            client.ws(host = HOST, port = PORT, path = TEST_PATH) {
//                send(Frame.Text("testClient"))
//
//                val frame = incoming.receive()
//                when (frame) {
//                    is Frame.Text -> println(frame.readText())
//                    is Frame.Binary -> println(frame.readBytes())
//                }
//            }
//        }
//    }

    //    fun signIn(localUser: User, channel: Channel<Message>, signInObserver: SignInObserver) =
//        launch {
//            try {
//                client.ws(host = HOST_ADDRESS, port = PORT, path = PATH_SIGN_IN) {
//
//                    signInObserver.onSignInSuccess()
//
//                    val frameText = Frame.Text(gson.toJson(localUser))
//                    outgoing.send(frameText)
//
//                    Timber.d("sender text ${gson.toJson(localUser)}")
//
//                    while (true) {
//                        launch {
//                            sendingData(this@ws)
//                        }
//                        launch {
//                            receiveData(this@ws, channel)
//                        }
//                    }
//                }
//            } catch (exception: Exception) {
//                signInObserver.onSignInFailed(exception.stackTrace.toString())
//            }
//        }
//
//    private suspend fun sendingData(socket: ClientWebSocketSession) =
//        sendChannel.poll()?.let {
//            val message = gson.toJson(it)
//            Timber.d("Sending message $message")
//            socket.outgoing.send(Frame.Text(message))
//        }
//
//    private suspend fun receiveData(socket: ClientWebSocketSession, channel: Channel<Message>) =
//        socket.incoming.poll()?.let { frame ->
//            if (frame is Frame.Text) {
//                val data = frame.readText()
//                Timber.d("Received: $data")
//                gson.fromJson(data, Message::class.java).takeIf { it.message != null }
//                    ?.let { channel.send(it) }
//            }
//        }
//
//    /**
//     * @return all users which connected to userReceiver
//     */
//    fun getUsersForConnecting(message: Message, channel: Channel<Message>) =
//        launch {
//            try {
//                client.ws(host = HOST_ADDRESS, port = PORT, path = PATH_GET_USERS_CONNECTING) {
//
//                    outgoing.send(Frame.Text(gson.toJson(message)))
//
//                    incoming.receiveOrNull()?.let { frame ->
//                        val data = (frame as Frame.Text).readText()
//
//                        Timber.d("got users $data")
//
//                        val messager = Message(
//                            message.userReceiver,
//                            message.userSender,
//                            data,
//                            Message.Type.USERS_CONNECTED
//                        )
//                        Timber.d("got users ${messager}")
//                        channel.send(messager)
//                    }
//                }
//            } catch (exception: Exception) {
//                Timber.e("got users $exception")
//            }
//        }
//
//    /**
//     * @return all users which sign in to server
//     */
//    fun getUsers(localUser: User, observer: GetUsersObserver) =
//        launch {
//            try {
//                client.ws(host = HOST_ADDRESS, port = PORT, path = PATH_GET_USERS_CONNECTED) {
//
//                    outgoing.send(Frame.Text(localUser.userName))
//
//                    incoming.receiveOrNull()?.let { frame ->
//
//                        val itemsListType: Type = object : TypeToken<ArrayList<User>>() {}.type
//                        val data = (frame as Frame.Text).readText()
//                        val users = gson.fromJson<ArrayList<User>>(data, itemsListType)
//
//                        if (users is ArrayList<User>) {
//                            Timber.d("getUsers userList $users")
//                            observer.onGetUsersSuccess(users)
//                        } else {
//                            observer.onGetUsersFailed(Exception("didn't get users"))
//                        }
//
//                    }
//                }
//            } catch (exception: Exception) {
//                observer.onGetUsersFailed(exception)
//            }
//        }
//
//    fun send(message: Message) = runBlocking {
//        sendChannel.send(message)
//    }
//
//    fun destroy() {
//        client.close()
//        job.complete()
//    }

    companion object {
        const val HOST = "79.110.133.147"
        const val PORT = 8080
        const val TEST_PATH = "/test"
        
    }
}
