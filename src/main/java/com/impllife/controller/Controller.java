package com.impllife.controller;

import com.impllife.data.jpa.entity.Account;
import com.impllife.data.jpa.provide.UserRepo;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    private UserRepo repo;

    @GetMapping("/getHistory")
    public ResponseEntity<Object> getHistory(@RequestParam Long userId) {
        return ResponseEntity.ok(repo.findById(userId).orElseThrow());
    }

    @PostMapping("/register")
    public ResponseEntity<Account> register(@RequestBody Account account) {
        repo.save(account);
        return ResponseEntity.ok(account);
    }

    @PostMapping("/addAct")
    public ResponseEntity<Object> register(@RequestParam Long userId) {
        Optional<Account> byId = repo.findById(userId);
        if (byId.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Account account = byId.get();
        String oldAct = account.getAct();
        if (!Strings.isNotBlank(oldAct)) {
            account.setAct(String.valueOf(Math.round(Math.random() * 100)));
        } else {
            account.setAct(oldAct + "|" + Math.round(Math.random() * 100));
        }
        repo.save(account);
        return ResponseEntity.ok().build();
    }
}
