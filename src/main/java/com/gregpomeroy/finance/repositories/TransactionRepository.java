package com.gregpomeroy.finance.repositories;

import com.gregpomeroy.finance.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
