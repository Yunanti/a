package com.bootcamp.multipolar.accountbank.controller;

import com.bootcamp.multipolar.accountbank.domain.Account;
import com.bootcamp.multipolar.accountbank.dto.ErrorMessage;
import com.bootcamp.multipolar.accountbank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //    membuat product baru
    @PostMapping
    public ResponseEntity<?> createProduct(@Valid @RequestBody Account account,
                                           BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ErrorMessage> validationErrors = new ArrayList<>();
            for (FieldError error : bindingResult.getFieldErrors()) {
                ErrorMessage errorMessage = new ErrorMessage();
                errorMessage.setCode("VALIDATION_ERROR");
                errorMessage.setMessage(error.getDefaultMessage());
                validationErrors.add(errorMessage);
            }
            return ResponseEntity.badRequest().body(validationErrors);
        }
        Account createdAccount = accountService.createOrUpdateAccount(account);
        return ResponseEntity.ok(createdAccount);
    }

    //    get semua accoutn
    @GetMapping
    public List<Account> getAllAccount(){
        return accountService.getAllAccounts();
    }

    //    get account by id lewat pathvariable/segment
    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable String id){
        Optional<Account> account = accountService.getAccountById((id));
        return account.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    //    edit account by id
    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable String id, @RequestBody Account account){
        account.setId(id);
        return accountService.createOrUpdateAccount(account);
    }

    //    delete account
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccountId(@PathVariable String id){
        accountService.deleteAccountById(id);
        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/nik/{nik}")
//    public ResponseEntity<Account> getAccountByNik(@PathVariable String nik){
//        Optional<Account> todo = custService.findByNikCaseInsensitive(nik);
//        return todo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//    }
//
//    //    mengambil accounts berdasarkan nama accountnya
//    @GetMapping("/accountHolder/name/{name}")
//    public List<Account> getAccountHolderByName(@PathVariable String name){
//        return accountService.findByName(name);
//    }
}
