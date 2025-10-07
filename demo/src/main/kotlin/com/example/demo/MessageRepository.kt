package com.example.demo

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface MessageRepository : CrudRepository<Message, UUID>