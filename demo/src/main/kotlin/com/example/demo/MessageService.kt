// MessageService.kt
package com.example.demo

import org.springframework.stereotype.Service
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import java.util.*

@Service
class MessageService(private val db: JdbcTemplate) {
    fun findMessages(): List<Message> = db.query("SELECT * FROM messages") { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }

    fun save(message: Message): Message {
        val id = UUID.randomUUID().toString()
        db.update(
            "INSERT INTO messages values ( ?, ? )",
            id, message.text
        )
        return message.copy(id = id)
    }

    fun findById(id: String): Message? = db.query(
        "SELECT * FROM messages WHERE id = ?",
        { response, _ -> Message(response.getString("id"), response.getString("text")) },
        id
    ).singleOrNull()
}