package com.example.demo

import org.springframework.stereotype.Service
import org.springframework.data.repository.findByIdOrNull
import java.util.*

@Service
class MessageService(private val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findAll().toList()

    fun findMessageById(id: UUID): Message? = db.findByIdOrNull(id)

    fun save(message: Message): Message = db.save(message)
}