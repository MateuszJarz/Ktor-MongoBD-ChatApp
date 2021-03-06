package com.example.ktor_mongobd_chatapp.data.remote.dto

import com.example.ktor_mongobd_chatapp.domain.model.Message
import kotlinx.serialization.Serializable
import java.text.DateFormat
import java.util.*

@Serializable
data class MessageDto(
    val text: String,
    val timestamp: Long,
    val username: String,
    val id: String
) {
    fun toMessage(): Message {
        val date = Date(timestamp)
        val formattedTime = DateFormat
            .getDateInstance(DateFormat.DEFAULT)
            .format(date)
        return Message(
            text = text,
            formattedTime = formattedTime,
            username = username
        )
    }
}
