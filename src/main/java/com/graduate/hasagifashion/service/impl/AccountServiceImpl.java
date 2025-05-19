package com.graduate.hasagifashion.service.impl;

import com.graduate.hasagifashion.dto.AccountDTO;
import com.graduate.hasagifashion.mapper.AccountMapper;
import com.graduate.hasagifashion.model.Account;
import com.graduate.hasagifashion.repository.AccountRepository;
import com.graduate.hasagifashion.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        Account account = AccountMapper.mapToAccount(accountDTO);
        accountRepository.save(account);
        return null;
    }
}
