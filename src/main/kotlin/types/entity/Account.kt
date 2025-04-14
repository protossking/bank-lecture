package org.example.types.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
@Table(name = "accounts")
data class Account(

    @Id
    @Column(name = "ulid", length = 12 , nullable = false)
    val ulid: String, //시간값을 가지고 있는 문자열

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_ulid", nullable = false)
    val user: User,

    @Column(name = "balance", nullable = false, precision = 15, scale = 2)
    var balance: BigDecimal = BigDecimal.ZERO,

    @Column(name = "account_number", length = 100, nullable = false, unique = true)
    val accountNumber: String,

    @Column(name = "is_deleted", nullable = false)
    val isDeleted: Boolean = false,

    @Column(name = "created_at", nullable = false, updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at", nullable = false)
    val updated: LocalDateTime = LocalDateTime.now()

    ) {

}