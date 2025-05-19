package com.graduate.hasagifashion.mapper;

import com.graduate.hasagifashion.dto.AccountDTO;
import com.graduate.hasagifashion.model.Account;

public class AccountMapper {
    public static AccountDTO mapToAccountDto(Account account) {
        return new AccountDTO(
                account.getId(),
                account.getFullName(),
                account.getEmail(),
                account.getPassword(),
                account.getAvatar(),
                account.getIsDeleted());
    }

    public static Account mapToAccount(AccountDTO accountDTO) {
        return new Account(
                accountDTO.getId(),
                accountDTO.getFullName(),
                accountDTO.getEmail(),
                accountDTO.getPassword(),
                accountDTO.getAvatar(),
                accountDTO.isDelete()
        );
    }
}
