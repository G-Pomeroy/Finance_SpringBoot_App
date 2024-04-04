package com.gregpomeroy.finance.controller;

import com.gregpomeroy.finance.DTO.InvestmentDTO;
import com.gregpomeroy.finance.DTO.TransactionDTO;
import com.gregpomeroy.finance.entity.Investment;
import com.gregpomeroy.finance.entity.Transaction;
import com.gregpomeroy.finance.repositories.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/investments")
public class InvestmentController {

    @Autowired
    private InvestmentRepository investmentRepository;

    @GetMapping
    public List<Investment> getAllInvestments() {
        return investmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Investment> getInvestmentById(@PathVariable Long id) {
        Optional<Investment> optionalInvestment = investmentRepository.findById(id);
        return optionalInvestment.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Investment createInvestment(@RequestBody Investment investment) {
        return investmentRepository.save(investment);
    }

    @PostMapping("/investments")
    public Investment createInvestment(@RequestBody InvestmentDTO request) {

        double amount = request.getAmount();

        Investment investment = new Investment();
        investment.setAmount(amount);


        return investmentRepository.save(investment);
    }

}
