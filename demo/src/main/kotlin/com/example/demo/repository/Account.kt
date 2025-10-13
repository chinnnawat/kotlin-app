package com.example.demo.repository
import com.example.demo.entity.Account
import org.springframework.data.repository.CrudRepository
import java.util.UUID



interface AccountRepository : CrudRepository<Account, UUID> {}