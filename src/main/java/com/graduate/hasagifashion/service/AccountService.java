package com.graduate.hasagifashion.service;

import com.graduate.hasagifashion.dto.AccountDTO;
import com.graduate.hasagifashion.model.Account;
import com.graduate.hasagifashion.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    AccountDTO createAccount(AccountDTO accountDTO);
}
