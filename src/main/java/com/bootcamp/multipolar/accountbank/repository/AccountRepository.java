package com.bootcamp.multipolar.accountbank.repository;

import com.bootcamp.multipolar.accountbank.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends MongoRepository<Account, String> {
//    Optional<Account> findByNik(String nik);
//    @Query("{ 'nik' : { $regex: '34826226646462900', $options: 'i' } }")
//    Optional<Account> findByNikCaseInsensitive(String nik);

    @Query("{ 'accountHolder:name' : { $regex: ?0, $options: 'i' } }")
    List<Account> findByName(String name);
}
