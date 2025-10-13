package com.example.demo.entity
import java.util.UUID
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.OneToOne
import jakarta.persistence.MapsId
import jakarta.persistence.JoinColumn
import jakarta.persistence.FetchType
import java.time.OffsetTime

@Entity
@Table(name = "profile")
class Profile(
    @Id
    @Column(name = "account_id")
    val accountId: UUID,
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "account_id")
    val account: Account,


    @Column(unique = true, nullable = false)
    val username: String,

    @Column(unique = true, nullable = true)
    var firstName: String ? = null,
    @Column(unique = true, nullable = true)
    var lastName: String ? = null,
    @Column(unique = true, nullable = true)
    val bio: String ? = null,
    @Column(unique = true, nullable = true)
    val avatarUrl: String ? = null,
    @Column(unique = true, nullable = true)
    var coverUrl: String ? = null,
    @Column(unique = true, nullable = true)
    var gender: String ? = null,
    @Column(name="created_at", nullable = true)
    val createdAt : OffsetTime = OffsetTime.now(),
    @Column(name="updated_at", nullable = true)
    var updatedAt : OffsetTime ? = null,
)