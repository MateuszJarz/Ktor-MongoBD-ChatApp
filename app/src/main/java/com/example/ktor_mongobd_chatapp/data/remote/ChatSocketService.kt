package com.example.ktor_mongobd_chatapp.data.remote

import com.example.ktor_mongobd_chatapp.domain.model.Message
import com.example.ktor_mongobd_chatapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface ChatSocketService {

    suspend fun initSession(
        username: String
    ): Resource<Unit>

    suspend fun sendMessage(message: String)
    fun observeMessages(): Flow<Message>
    suspend fun closeSession()

    companion object {
        const val BASE_URL = "ws://10.0.2.2:8080"
    }

    sealed class Endpoints(val url: String) {
        object ChatSocket : Endpoints("$BASE_URL/chat-socket")
    }
}