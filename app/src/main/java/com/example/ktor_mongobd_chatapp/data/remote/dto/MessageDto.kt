package com.example.ktor_mongobd_chatapp.data.remote.dto

import kotlinx.serialization.Serializable
import java.sql.Timestamp

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: Long,
    val username: String,
    val id: String
)
