package com.graduate.hasagifashion.controller.web;

import com.graduate.hasagifashion.model.Account;
import com.graduate.hasagifashion.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "homeControllerOfWeb")
@RequestMapping("/api/f")
public class HomeController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.findAll();
    }
}
