package com.graduate.hasagifashion.repository;

import com.graduate.hasagifashion.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByEmail(String email);
}
