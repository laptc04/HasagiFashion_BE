package com.graduate.hasagifashion.controller.admin.manage;

import com.graduate.hasagifashion.model.Account;
import com.graduate.hasagifashion.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/account")
@AllArgsConstructor
public class AccountController {
    private AccountService accountService;


}
