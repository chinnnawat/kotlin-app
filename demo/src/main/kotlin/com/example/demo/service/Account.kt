package com.example.demo.service
import com.example.demo.entity.Account
import com.example.demo.repository.AccountRepository
import org.springframework.stereotype.Service
import org.springframework.data.repository.findByIdOrNull
import java.util.*



@Service
class AccountService(private val db: AccountRepository) {
    fun findAccounts(): List<Account> = db.findAll().toList()

    fun findAccountById(id: UUID): Account? = db.findByIdOrNull(id)

    fun save(account: Account): Account = db.save(account)
}