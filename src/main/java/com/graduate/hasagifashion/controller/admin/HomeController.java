package com.graduate.hasagifashion.controller.admin;

import com.graduate.hasagifashion.model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController(value = "homeControllerOfAdmin")
@CrossOrigin("*")
@RequestMapping("/api")
public class HomeController {

    @PostMapping("/submit")
    public ResponseEntity<String> submit(@RequestBody Account account) {
        System.out.println("Received form data: " + account.getEmail());

        return ResponseEntity.ok("Form submitted successfully");
    }
}
