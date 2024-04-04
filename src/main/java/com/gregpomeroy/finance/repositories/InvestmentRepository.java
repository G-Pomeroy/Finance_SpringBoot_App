package com.gregpomeroy.finance.repositories;

import com.gregpomeroy.finance.entity.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
