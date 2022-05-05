package com.example.ktor_mongobd_chatapp.presentation.chat

import com.example.ktor_mongobd_chatapp.domain.model.Message

data class ChatState(
    val message: List<Message> = emptyList(),
    val isLoading: Boolean = false
)
