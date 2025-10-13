package com.example.demo.entity
import java.util.UUID
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.OffsetTime

@Entity
@Table(name = "account")
class Account(
    @Id
    val id: UUID ? = null,
    @Column(unique = true, nullable = true)
    val email: String ? = null,
    @Column(name = "password_hash", nullable = false)
    val passwordHash: String,
    @Column(unique = true, nullable = true)
    val status : AccountStatus = AccountStatus.ACTIVE,
    @Column(unique = true, nullable = true)
    val createdAt : OffsetTime = OffsetTime.now(),
    @Column(unique = true, nullable = true)
    var updatedAt : OffsetTime ? = null,
    @Column(unique = true, nullable = true)
    var deletedAt : OffsetTime ? = null
)

enum class AccountStatus {
    ACTIVE,
    INACTIVE,
    DELETED
}