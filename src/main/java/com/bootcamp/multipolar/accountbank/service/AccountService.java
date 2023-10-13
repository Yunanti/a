package com.bootcamp.multipolar.accountbank.service;

import com.bootcamp.multipolar.accountbank.domain.Account;
import com.bootcamp.multipolar.accountbank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    //    fungsi untuk get all account
    public List<Account> getAllAccounts(){ // untuk mendapatkan data dari repository
        return accountRepository.findAll();
    }

    //    fungsi untuk get account by id
    public Optional<Account> getAccountById(String id){
        return accountRepository.findById(id);
    }

    //    fungsi untuk create or update account
    public Account createOrUpdateAccount(Account account){
        return accountRepository.save(account);
    }

    //    fungsi untuk menghapus account
    public void deleteAccountById(String id){
        accountRepository.deleteById(id);
    }

//    //    fungsi untuk kata sensitif
//    public Optional<Account> findByNikCaseInsensitive(String nik){
//        return accountRepository.findByNikCaseInsensitive(nik);
//    }
//
//    //    fungsi untuk mencari berdasarkan nama account holder
//    public List<Account> findByName(String name){
//        return accountRepository.findByName(name);
//    }
}
