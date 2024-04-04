package com.gregpomeroy.finance.controller;

import com.gregpomeroy.finance.DTO.TransactionDTO;
import com.gregpomeroy.finance.entity.Transaction;
import com.gregpomeroy.finance.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Transaction> getTransactionById(@PathVariable Long id) {
        Optional<Transaction> optionalTransaction = transactionRepository.findById(id);
        return optionalTransaction.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @PostMapping("/transactions")
    public Transaction createTransaction(@RequestBody TransactionDTO request) {

        double amount = request.getAmount();

        Transaction transaction = new Transaction();
        transaction.setAmount(amount);
        transaction.setCategory(request.getCategory());
        transaction.setTags(request.getTags());

        return transactionRepository.save(transaction);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> updateTransaction(@PathVariable Long id, @RequestBody Transaction updatedTransaction) {
        Optional<Transaction> optionalTransaction = transactionRepository.findById(id);
        if (optionalTransaction.isPresent()) {
            Transaction existingTransaction = optionalTransaction.get();

            existingTransaction.setAmount(updatedTransaction.getAmount());
            existingTransaction.setCategory(updatedTransaction.getCategory());
            existingTransaction.setTags(updatedTransaction.getTags());

            Transaction savedTransaction = transactionRepository.save(existingTransaction);
            return ResponseEntity.ok(savedTransaction);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
